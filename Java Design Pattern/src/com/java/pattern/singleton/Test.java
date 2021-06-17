package com.java.pattern.singleton;

import java.io.*;

public class Test {



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateUtil dateUtil1=DateUtil.getInstance();

            ObjectOutputStream oss=new ObjectOutputStream(
                    new FileOutputStream("C:\\Users\\Mintu\\OneDrive - Maharishi International University\\Pictures\\Java Design Pattern/dateUtil.ser"));
            oss.writeObject(dateUtil1);
        DateUtil dateUtil2=DateUtil.getInstance();
        ObjectInputStream ios=new ObjectInputStream(new FileInputStream("C:\\Users\\Mintu\\OneDrive - Maharishi International University\\Pictures\\Java Design Pattern/dateUtil.ser"));
        DateUtil dateUtilread=(DateUtil)ios.readObject();

     ios.close();
     oss.close();

        System.out.println(dateUtilread==dateUtil2);
    }
}
