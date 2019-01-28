package TextFile;

import java.io.*;
import java.util.Random;

public class WriteText {
    public static void main(String[]args) throws IOException
    {



        FileWriter save = new FileWriter("One hundred1.txt");
        Random number = new Random();

        for(int i=0; i<100; i++){
        System.out.println(number.nextInt(20));
    }
        save.write(number.nextInt(20));
        save.close();

    }
}
