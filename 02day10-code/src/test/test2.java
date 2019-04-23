package test;
//描述:利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，如写出：”i love java”


import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("02day10-code\\src\\test\\e.txt"));
        bos.write("i love java".getBytes());
        bos.close();

    }
}
