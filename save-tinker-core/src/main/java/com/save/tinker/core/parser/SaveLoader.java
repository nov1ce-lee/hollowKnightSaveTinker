package com.save.tinker.core.parser;

import java.io.InputStream;


public class SaveLoader {

    public String load(InputStream stream) {

        try {
            String base64 = new BinaryFormatterStringExtractor().extractString(stream);

            SaveDecryptor decryptor = new SaveDecryptor();

            return decryptor.decryptBase64ToJson(base64);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}