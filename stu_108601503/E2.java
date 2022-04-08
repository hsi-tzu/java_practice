package stu_108601503;
import java.util.*;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int high= scanner.nextInt();
        while(high!=-1){
            String tower=scanner.next();
            for(int i=0;i<high;i++){
                for(int j=0;j<i;j++){
                    System.out.print(" ");//空白
                }
                for(int k=0;k<high*2-i*2;k++){
                    if(i%2==0){
                        System.out.print(tower.charAt(0));
                    }
                    else{
                        System.out.print(tower.charAt(1));
                    }
                }
                System.out.print("\n");
             }
            high= scanner.nextInt();
        }
    }
}
