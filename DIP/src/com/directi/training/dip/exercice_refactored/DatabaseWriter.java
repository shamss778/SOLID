package com.directi.training.dip.exercice_refactored;


public class DatabaseWriter implements Writer {

    private MyDatabase database;
    public DatabaseWriter(com.directi.training.dip.exercice_refactored.MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String content) {
        database.write(content);
    }

}
