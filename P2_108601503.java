/**
 Practice 2
 Student Number：108601503
 Course：2022-CE1004-A
 */
import java.io.*;
public class P2_108601503 {
    public static void main(String[] args){
        try {
            FileReader file1 = new FileReader("test.txt");

            BufferedReader br = new BufferedReader(file1);
            FileWriter fw = new FileWriter("108601503.txt");
            BufferedWriter bufw = new BufferedWriter(fw);
            String line;
            while ((line = br.readLine()) != null) {

                bufw.write(line);
                bufw.newLine();
            }
            bufw.flush();
            bufw.close();
        }
        catch (IOException e) {System.out.println(e);}

    }
}
