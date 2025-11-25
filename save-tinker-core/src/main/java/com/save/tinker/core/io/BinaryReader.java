package com.save.tinker.core.io;

import java.io.IOException;
import java.io.InputStream;

public class BinaryReader implements AutoCloseable {
    private final InputStream stream;

    public BinaryReader(InputStream stream) {
        this.stream = stream;
    }

    public int readInt() throws IOException {
        byte[] bytes = new byte[4];
        readFully(bytes);
        // Little-endian
        return ((bytes[3] & 0xff) << 24)
                | ((bytes[2] & 0xff) << 16)
                | ((bytes[1] & 0xff) << 8)
                | (bytes[0] & 0xff);
    }

    public byte readByte() throws IOException {
        int b = stream.read();
        if (b == -1) throw new IOException("Unexpected end of file");
        return (byte) b;
    }

    public byte[] readBytes(int length) throws IOException {
        byte[] bytes = new byte[length];
        readFully(bytes);
        return bytes;
    }

    private void readFully(byte[] bytes) throws IOException {
        int read = 0;
        while (read < bytes.length) {
            int r = stream.read(bytes, read, bytes.length - read);
            if (r == -1) throw new IOException("Unexpected end of file");
            read += r;
        }
    }

    @Override
    public void close() throws Exception {
        stream.close();
    }
}
