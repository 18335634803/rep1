package demo;

import java.io.*;

public class demo02 {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        BufferedInputStream bis=new BufferedInputStream( new FileInputStream("D:\\100.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("02day10-code\\src\\demo\\1.jpg"));
        byte[] bytes=new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);

        }
        bis.close();
        bos.close();
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
