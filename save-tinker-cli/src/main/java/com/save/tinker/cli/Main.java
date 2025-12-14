package com.save.tinker.cli;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.save.tinker.core.analyzer.model.JsonSaveFile;
import com.save.tinker.core.analyzer.model.PlayerData;
import com.save.tinker.core.analyzer.model.sub.Bosses;
import com.save.tinker.core.analyzer.model.sub.Equipments;
import com.save.tinker.core.parser.io.SaveLoader;
import com.save.tinker.core.parser.io.FileExporter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String fileName = args.length > 0 ? args[0] : "dat/save.dat";
        InputStream stream = Main.class.getClassLoader().getResourceAsStream(fileName);

        if (stream == null) {
            System.out.println("存档文件 " + fileName + " 未找到！");
            return;
        }

        SaveLoader loader = new SaveLoader();
        String json = loader.load(stream);

        if (Objects.nonNull(json)) {
            FileExporter fileExporter = FileExporter.builder()
                    .fileContent(json)
                    .filePath("output/save.json")
                    .build();
            fileExporter.exportToJson();

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            try {
                JsonSaveFile jsonSaveFile = objectMapper.readValue(json, JsonSaveFile.class);
                PlayerData playerData = jsonSaveFile.getPlayerData();
                Bosses bosses = playerData.getBosses();
                System.out.println("bosses: " + bosses);
                System.out.println("bosses defeated: " + bosses.getTrueList());
                System.out.println("bosses undefeated: " + bosses.getFalseList());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
