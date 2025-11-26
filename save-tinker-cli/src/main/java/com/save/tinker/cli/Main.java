package com.save.tinker.cli;

import com.save.tinker.core.SaveLoader;

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
            System.out.println(json);
        }
    }
}
