package com.save.tinker.cli;

import com.save.tinker.core.SaveLoader;

public class Main {
    public static void main(String[] args) {
        String path = "resources/test_random.dat";

        if (args.length > 0) {
            path = args[0];
        }

        SaveLoader loader = new SaveLoader();
        loader.load(path);
    }
}
