package demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class demo06 {
    public static void main(String[] args) throws IOException {


        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\B.txt"));
        osw.write("你好");
        osw.close();

/*

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("02day10-code\\src\\demo\\v.txt"),"GBK");
        osw.write("你好");
        osw.close();

*/

    }

}