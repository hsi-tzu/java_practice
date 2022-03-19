/**
 Assignment 2
 Student Number：108601503
 Course：2022-CE1002
 */
import java.util.Scanner;
public class A2_108601503 {
    public static void main(String[] args){
        String word;
        int number;
        Scanner scanner = new Scanner(System.in); //定義scanner，等待输入
        number = scanner.nextInt();
        word = scanner.next();
        for(int k = 0; k<number-1; k++){
            for(int i = number-1-k; i > 0; i--) {
                System.out.print(" ");
            }
            System.out.print(word.charAt(0));
            if(k>0) {
                for (int j = 0; j < k * 2; j++) {
                    System.out.print(word.charAt(1));
                }
            }
            System.out.println(word.charAt(0));
        }
        for(int i =0 ; i < number*2; i++) {
            System.out.print(word.charAt(0));
        }

    }
}
