package demo;

import java.io.*;

public class demo04 {
    public static void main(String[] args) throws IOException {
      /* *//* BufferedReader br = new BufferedReader(new FileReader("02day10-code\\src\\demo\\a.txt"));
        int len;
        while ((len = br.read()) != -1) {
            System.out.println((char) len);
        }
       *//* br.close();
*/

        BufferedWriter bw = new BufferedWriter(new FileWriter(""));
        bw.write("雪停了");
        bw.close();
    }
}