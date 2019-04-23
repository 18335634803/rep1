package test;
        /*   定义一个学生类，包含姓名，年龄，性别等成员变量，
        提供setters和getters方法以及构造方法。在测试类中创建一个学生对象，
        给学生对象的三个成员变量赋值。然后将该对象保存到当前项目根目录下的stu.txt文件中。*/


import java.io.*;
import java.util.ArrayList;


public class test9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("02day10-code\\src\\test\\x.txt"));

        Student st1=new Student("小张",18,"男");
        Student st2=new Student("小刘",19,"女");
        Student st3=new Student("小王",22,"女");
        ArrayList<Student> list=new ArrayList<>();
         list.add(st1);
         list.add(st2);
         list.add(st3);
         oos.writeObject(list);
         oos.writeObject("\r\n");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("02day10-code\\src\\test\\x.txt"));
        Object o = ois.readObject();

        System.out.println(o);
        ois.close();



         oos.close();


    }
}
