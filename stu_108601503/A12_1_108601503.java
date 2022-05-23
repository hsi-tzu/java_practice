package stu_108601503;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A12_1_108601503 {
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("A12_1_108601503.txt");
        BufferedWriter bufw =new BufferedWriter(fw);
        try{
            java.net.URL url=new java.net.URL("https://www.csie.ncu.edu.tw/");
            //int count =0;
            Scanner input=new Scanner(url.openStream());
            while(input.hasNext()){
                String line=input.nextLine();
                bufw.write(line+"\n");
                //System.out.println(line);
            }
           // System.out.println("The file size is"+count+" characters");

        }
        catch (java.net.MalformedURLException ex){
            System.out.println("Invalid URL");
        }
        catch (java.io.IOException ex){
            System.out.println("IO Errors");
        }
        bufw.flush();
        bufw.close();
    }

}
