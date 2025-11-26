package com.save.tinker.core.parser;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Properties;

public class SaveDecryptor {

    public String decryptBase64ToJson(String base64) throws Exception {

        byte[] encryptedBytes = Base64.getDecoder().decode(base64);

        SecretKeySpec secretKey = new SecretKeySpec(getKey().getBytes(StandardCharsets.UTF_8), "AES");

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decrypted = cipher.doFinal(encryptedBytes);

        return new String(decrypted, StandardCharsets.UTF_8);
    }

    private String getKey() {
        try (InputStream in = SaveDecryptor.class.getClassLoader().getResourceAsStream("application.properties")) {
            Properties props = new Properties();
            props.load(in);
            return props.getProperty("save.key");
        } catch (Exception e) {
            throw new RuntimeException("无法加载 key", e);
        }
    }

}