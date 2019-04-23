package demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class demo05 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> hm=new HashMap<>();
        BufferedReader br=new BufferedReader(new FileReader("D:\\1.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("02day10-code\\src\\demo\\h.txt"));
        String line;
        while ((line=br.readLine())!=null){
            String[] arr = line.split("\\.");
            hm.put((Integer.parseInt(arr[0])),arr[1]);

        }
        br.close();
        Set<Integer> keys = hm.keySet();
        ArrayList list=new ArrayList();
        list.addAll(keys);


        Collections.sort(list);
        for (Object k : list) {
            String value = hm.get(k);
             line=k+"."+value;

             bw.write(line);
             bw.write("\r\n");

        }
        bw.close();



    }
}
