package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

// Concrete implementation of Reader that reads data from a network source
// high-level module depending on abstraction (Reader interface)
public class NetworkDataReader implements Reader {
    private String urlString;

    public NetworkDataReader(String urlString) {
        this.urlString = urlString;
    }

    @Override
    public String read() throws IOException {
        URL url = new URL(urlString); // Create a URL object
        InputStream in = url.openStream(); // Open a stream to the URL
        InputStreamReader reader = new InputStreamReader(in); // Create an InputStreamReader to read the data
        StringBuilder inputString = new StringBuilder(); // StringBuilder to accumulate the read data
        int c; // Variable to hold each character read
        while ((c = reader.read()) != -1) { // Read until the end of the stream
            inputString.append((char) c);
        }
        reader.close(); 
        return inputString.toString();
    }
}
