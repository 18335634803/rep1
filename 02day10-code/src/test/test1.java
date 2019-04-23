package test;
 /*  描述:利用高效字节输出流往C盘下的d.txt文件输出一个字节数。*/

import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bw=new BufferedOutputStream(new FileOutputStream("02day10-code\\src\\test\\a.txt"));
        bw.write(65);
        bw.close();
    }
}
