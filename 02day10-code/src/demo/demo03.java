package demo;

import java.io.*;

public class demo03 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\zhaoqiang\\Desktop\\复习资料\\笔记");
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                String name = file1.getName();
                System.out.println(name);
            }
        }
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\zhaoqiang\\Desktop\\复习资料\\笔记\\name"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\zhaoqiang\\Desktop\\复习资料\\笔记1\\d.txt"));
        int len;
        byte[] bytes=new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes);
        }
        bis.close();
        bos.close();
        }
    }
