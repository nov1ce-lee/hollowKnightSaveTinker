package com.save.tinker.core.parser;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class BinaryFormatterStringExtractor {

    private static final byte STRING_TOKEN = 0x06;

    public String extractString(InputStream stream) throws Exception {
        byte[] raw = readAllBytes(stream);

        int len = raw.length;

        for (int i = 0; i < len; i++) {

            if (raw[i] == STRING_TOKEN) {

                // 1) objectId (4 bytes)
                int objectId = readInt32LE(raw, i + 1);

                // 2) read length-prefixed string length (7-bit encoded)
                int strlenOffset = i + 5;
                int[] lenInfo = read7bitEncodedInt(raw, strlenOffset);
                int strlen = lenInfo[0];
                int stringStart = lenInfo[1];

                if (strlen <= 0 || stringStart + strlen > len) {
                    continue; // length invalid, continue scanning
                }

                byte[] utf8 = new byte[strlen];
                System.arraycopy(raw, stringStart, utf8, 0, strlen);

                return new String(utf8, StandardCharsets.UTF_8);
            }
        }

        throw new IllegalStateException("未找到 BinaryFormatter 字符串对象");
    }

    private int readInt32LE(byte[] raw, int pos) {
        return (raw[pos] & 0xff)
                | ((raw[pos+1] & 0xff) << 8)
                | ((raw[pos+2] & 0xff) << 16)
                | ((raw[pos+3] & 0xff) << 24);
    }

    // 解析 C# BinaryFormatter 的 7-bit int
    private int[] read7bitEncodedInt(byte[] raw, int pos) {
        int result = 0;
        int shift = 0;
        int offset = pos;

        while (true) {
            int b = raw[offset] & 0xff;
            offset++;
            result |= (b & 0x7f) << shift;
            if ((b & 0x80) == 0) break;
            shift += 7;
        }

        return new int[]{result, offset};
    }

    private byte[] readAllBytes(InputStream stream) throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] temp = new byte[4096];
        int n;
        while ((n = stream.read(temp)) != -1) {
            buffer.write(temp, 0, n);
        }
        return buffer.toByteArray();
    }
}

