/**
 Practice 6
 Student Number：108601503
 Course：2022-CE1004-A
 */
import java.util.ArrayList;
import java.util.*;

public class P6_108601503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        ArrayList<String> bookshelf =new ArrayList<>();

        String input=scanner.next();
        String[] str_arr = input.split(" ");

        while(!str_arr[0].equals("exit")) {
            int in_out = Integer.parseInt(str_arr[0]);
            int index = Integer.parseInt(str_arr[1]);
            if (in_out == 1) {
                String name = str_arr[2];
                bookshelf.add(index-1, name);

            }
            else{
                bookshelf.remove(index-1);
            }
            input=scanner.next();
            str_arr = input.split(" ");
        }
        System.out.println(bookshelf);


    }
}
