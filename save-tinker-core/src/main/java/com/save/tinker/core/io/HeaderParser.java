package com.save.tinker.core.io;

import java.io.IOException;

public class HeaderParser {

    public SaveHeader parse(BinaryReader reader) throws IOException {

        int magic = reader.readInt();
        int version = reader.readInt();
        int dataLength = reader.readInt();

        return new SaveHeader(magic, version, dataLength);
    }
}