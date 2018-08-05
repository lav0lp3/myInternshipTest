package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataTransfer {
    private BufferedReader reader;

    public DataTransfer() {
        try {
            reader = new BufferedReader(new FileReader(new File("C:\\Users\\lav0lp3\\Downloads\\InternshipTest\\InternshipTest\\src\\main\\resources\\data.txt")));
        } catch(IOException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }

    public String read() {
        String line = null;
        try {
            while (reader.ready()) {
                line += reader.readLine();

            }
            reader.close();
        } catch(IOException e) {
            System.out.println("File reading Error");
            e.printStackTrace();
        }
        return line;
    }
}