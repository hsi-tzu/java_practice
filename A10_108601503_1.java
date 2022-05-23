import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A10_108601503_1 {
    public static void main(String[] args){

        while(true) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("請輸入整數");
            try {
                int up = scanner.nextInt();
                int down = scanner.nextInt();
                if (down < 0 || up < 0) {
                    throw new noPositiveInteger();
                }
                double ans = up / down;
                System.out.println(ans);
                break;
            } catch (noPositiveInteger e) {

                System.out.println("分子或分母為負數了！");
            } catch (ArithmeticException e) {
                System.out.println("分母不能為0");
            } catch (InputMismatchException e) {
                System.out.println("輸入為非整數");
            }
        }

    }
}
class noPositiveInteger extends Exception{}