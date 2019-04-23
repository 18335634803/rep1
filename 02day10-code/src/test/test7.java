package test;
 /*  描述:从键盘录入一行字符串，利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = sc.next();
        PrintStream ps=new PrintStream(new FileOutputStream("02day10-code\\src\\test\\d.txt"));
        ps.println(s);


        ps.close();
    }


}
