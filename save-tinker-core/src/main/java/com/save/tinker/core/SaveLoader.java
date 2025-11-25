package com.save.tinker.core;

import com.save.tinker.core.io.BinaryReader;
import com.save.tinker.core.io.HeaderParser;
import com.save.tinker.core.io.SaveHeader;

import java.nio.file.Files;
import java.nio.file.Paths;

public class SaveLoader {

    private final HeaderParser headerParser = new HeaderParser();

    public void load(String path) {
        System.out.println("读取文件: " + path);
        try (BinaryReader reader = new BinaryReader(Files.newInputStream(Paths.get(path)))) {

            SaveHeader header = headerParser.parse(reader);

            System.out.println("解析的头部信息:");
            System.out.println(header);

        } catch (Exception e) {
            System.err.println("读取失败: " + e.getMessage());
        }
    }
}