package demo;

import java.io.*;

public class demo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("02day10-code\\src\\demo\\a.txt");
        BufferedOutputStream bis=new BufferedOutputStream(fos);


        bis.write("今天下雪了！".getBytes());
        bis.close();

    }

}
