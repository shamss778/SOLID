package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private Reader _reader;
    private Writer _writer;

    public EncodingModule(Reader reader, Writer writer) {
        _reader = reader;
        _writer = writer;
            }

    public void encode() throws IOException {
        String content = _reader.read();
        String encodedString = Base64.getEncoder().encodeToString(content.getBytes());
        _writer.write(encodedString);
    }
}
