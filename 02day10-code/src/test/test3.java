package test;
     /*描述:利用高效字节输入流和高效字节输出流完成文件的复制。
        要求：
        1.将C盘下的c.png文件复制到D盘下
        2.一次读写一个字节数组方式复制*/

import java.io.*;

public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("02day10-code\\src\\test\\e.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("02day10-code\\src\\test\\c.txt"));
        int len;
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
}
