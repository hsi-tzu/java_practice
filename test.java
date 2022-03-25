import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String hero_name= scanner.next();
        int input=scanner.nextInt();
        String pattern = "%-" + input + "s";
        System.out.println(String.format(pattern,hero_name)+"55");
    }
}
