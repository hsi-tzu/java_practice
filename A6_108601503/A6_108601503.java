/**
 Assignment 6
 Student Number：108601503
 Course：2022-CE1002
 */
package A6_108601503;
import java.util.*;

public class A6_108601503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Transaction> record =new Vector<Transaction>();
        while(true){

            int input=scanner.nextInt();
            if(input==1){
                String name=scanner.next();
                int income= scanner.nextInt();
                Transaction Tin=new Transaction(name);
                Tin.setIncome(income);
                Tin.setPay(0);
                record.add(Tin);



            }
            else if(input==2){
                String name=scanner.next();
                int pay= scanner.nextInt();
                Transaction Tout=new Transaction(name);
                Tout.setPay(pay);
                Tout.setIncome(0);
                record.addElement(Tout);

            }
            else if(input==3){
                int name_longest=0;
                int income_longest=0;
                int total=0;
                int income_count=0;
                for (int i=0;i< record.size();i++) {
                    if(record.get(i).getName().length()>name_longest){
                        name_longest=record.get(i).getName().length();
                    }
                    if(record.get(i).getIncome()>income_longest) {
                        income_longest = record.get(i).getIncome();
                    }
                    total=total+record.get(i).getIncome()-record.get(i).getPay();
                }
                while ( income_longest != 0 ) {
                    income_longest = income_longest / 10;
                    income_count = income_count + 1;
                }
                for (int i=0;i< record.size();i++){

                    String pattern = "%-" + name_longest + "s";
                    System.out.print(String.format(pattern, record.get(i).getName())+"  ");
                    String pattern2 = "%-" + income_count + "s";
                    System.out.println(String.format(pattern2, record.get(i).getIncome())+"  "+record.get(i).getPay());

                }
                System.out.println("Total: "+total);
            }
            else if(input==4){
                break;
            }
            else{
                System.out.println("Invalid Operation");
            }
        }
    }
}
