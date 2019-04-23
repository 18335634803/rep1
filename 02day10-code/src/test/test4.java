package test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*  分析以下需求，并用代码实现
        实现一个验证码小程序，要求如下：
        1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
        2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
*/
public class test4 {
         public static void main(String[] args) throws IOException {
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\IdeaProjects\\basic-coudle\\data.txt"));
             ArrayList<String> list = new ArrayList<>();
             Scanner sc = new Scanner(System.in);
             for (int i = 0; i < 3; i++) {
                 System.out.println("输入符串");
                 String next = sc.next();
                 bos.write(next.getBytes());
                 bos.write("\r\n".getBytes());
                 list.add(next);
             }
             bos.close();
             System.out.println("请输入验证码");
             String s1 = sc.next();

             for (String s : list) {
                 if (s1.equals(s)) {
                     System.out.println("验证成功");
                     break;
                 } else {
                     System.out.println("验证失败");
                     break;

                 }

             }

         }
             }




