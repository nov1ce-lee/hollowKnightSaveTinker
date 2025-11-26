package com.save.tinker.core.parser;

import lombok.Builder;
import lombok.Data;

import java.io.File;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

@Data
@Builder
public class FileExporter {
    private String filePath;
    private String fileContent;

    public void exportToJson() {
        File file = new File(filePath);

        // 如果目录不存在则创建
        File parent = file.getParentFile();
        if (!parent.exists()) {
            parent.mkdirs();
        }

        try (OutputStreamWriter writer = new OutputStreamWriter(Files.newOutputStream(file.toPath()), StandardCharsets.UTF_8)) {
            writer.write(fileContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
