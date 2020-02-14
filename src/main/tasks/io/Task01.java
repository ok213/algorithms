package main.tasks.io;

import java.io.*;

// написать метод write, который принимает название файла и InputStream.
// должен записать содержимое InputStream в файл

public class Task01 {

    public void copy(InputStream in, OutputStream out) {

    };

    public void write(InputStream in, String fileName) throws FileNotFoundException {

        File outputFile = new File(fileName);
        copy(in, new FileOutputStream(outputFile));

    }
}
