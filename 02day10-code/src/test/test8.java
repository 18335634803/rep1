package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
 /*  项目根路径下有text.txt文件，内容如下：
        我爱黑马
        123456
        利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中，内容如下：
        123456
        我爱黑马

        提示：List集合反转元素的顺序时，用到了如下API。
        java.util类 Collections*/
/*
static void	reverse(List<?> list)
                  反转指定列表中元素的顺序。
*/


public class test8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("02day10-code\\src\\test\\d.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("02day10-code\\src\\test\\d1.txt"));
        ArrayList<String> list=new ArrayList<>();
       String len;
        while ((len=br.readLine())!=null) {
            list.add(len);
        }
            System.out.println("=========");
            Collections.reverse(list);
            for (String s : list) {
               // System.out.println(s);
                bw.write(s);
                bw.write("\r\n");
            }


        br.close();
        bw.close();

        }



    }


