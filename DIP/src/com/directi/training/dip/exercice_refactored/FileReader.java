package com.directi.training.dip.exercice_refactored;

import java.io.BufferedReader;
import java.io.IOException;

// Concrete implementation of Reader that reads from a file
// high-level module depending on abstraction (Reader interface)
public class FileReader implements Reader {

    private String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() {
        BufferedReader br = null;
        StringBuilder content = new StringBuilder();
        try {
            br = new BufferedReader(new java.io.FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } return content.toString();
    }
        }

