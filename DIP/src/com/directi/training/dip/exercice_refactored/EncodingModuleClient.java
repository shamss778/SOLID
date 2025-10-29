package com.directi.training.dip.exercice_refactored;
import java.io.IOException;
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // Encode file to file
        Reader fileReader = new FileReader(
            "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        Writer fileWriter = new FileWriter(
            "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter);
        fileEncodingModule.encode();

        // Encode from network to database
        Reader networkReader = new NetworkDataReader(
            "http://myfirstappwith.appspot.com/index.html");
        com.directi.training.dip.exercice_refactored.MyDatabase database = new MyDatabase();
        Writer databaseWriter = new DatabaseWriter(database);
        EncodingModule networkEncodingModule = new EncodingModule(networkReader, databaseWriter);
        networkEncodingModule.encode();
    }

}
