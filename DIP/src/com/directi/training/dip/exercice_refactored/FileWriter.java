package com.directi.training.dip.exercice_refactored;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter implements Writer {
    private String filePath;

    public FileWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(filePath));
        writer.write(content);
        writer.close();
    }

}
