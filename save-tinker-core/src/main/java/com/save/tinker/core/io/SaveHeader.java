package com.save.tinker.core.io;

public class SaveHeader {

    private final int magic;
    private final int version;
    private final int dataLength;

    public SaveHeader(int magic, int version, int dataLength) {
        this.magic = magic;
        this.version = version;
        this.dataLength = dataLength;
    }

    public int getMagic() {
        return magic;
    }

    public int getVersion() {
        return version;
    }

    public int getDataLength() {
        return dataLength;
    }

    @Override
    public String toString() {
        return "SaveHeader{" +
                "magic=0x" + Integer.toHexString(magic) +
                ", version=" + version +
                ", dataLength=" + dataLength +
                '}';
    }
}