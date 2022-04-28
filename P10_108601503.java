/**
 Practice 10
 Student Number：108601503
 Course：2022-CE1004-A
 */

import java.util.*;
public class P10_108601503 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("(1)choose drinks (2)list (3)pay (4)exit");
        int ins=scanner.nextInt();
        Vector<item_count> record =new Vector<item_count>();
        while(true){
            if(ins!=1 && ins!=2 && ins!=3 && ins!=4){
                System.out.println("invalid input");
            }
            //1-------------------------------------------------
            else if(ins==1){
                System.out.println("choose drinks (drinks / amount)\n(1)Cola (2)Green Tea (3)Lemon Tea (4)Mineral Water");
                int drinks=scanner.nextInt();
                int amount=scanner.nextInt();
                int check_exist=0;
                if(drinks!=1 && drinks!=2 && drinks!=3 && drinks!=4){
                    System.out.println("invalid input");
                }
                else{
                    for(int i=0;i< record.size();i++){
                        if(drinks==record.get(i).getDrinks_num()){
                            record.get(i).setAmount(amount);
                            check_exist=1;
                            break;
                        }
                    }
                    if(check_exist==0){
                        item_count item=new item_count(drinks,amount);
                        record.add(item);
                    }
                }
            }
            //2-------------------------------------------------
            else if(ins==2){
                if(record.size()==0){
                    System.out.println("Empty");
                }
                else{
                    for (int i=0;i< record.size();i++){
                        System.out.println(record.get(i).getDrinks()+" "+record.get(i).getAmount());
                    }
                }

            }
            //3--------------------------
            else if(ins==3){
                int total_cost=0;
                int return_meney;
                for(int i=0;i< record.size();i++){
                    total_cost=total_cost+record.get(i).getTotalPrice();
                }
                System.out.println("total cost:"+total_cost);
                System.out.print("please pay:");
                int pay=scanner.nextInt();
                if(pay<total_cost){
                    System.out.println("money not enough");
                }
                else{
                    System.out.println("money change:"+(pay-total_cost));
                    System.out.println("thank you");
                    break;
                }
            }
            //4--------------------------------------------
            else if(ins==4){
                System.out.println("exit");
                break;
            }
            System.out.println("(1)choose drinks (2)list (3)pay (4)exit");
            ins=scanner.nextInt();
        }
    }
}

class item_count{
    public  item_count(int name,int count){
        if (name==1){
            this.drinks="Cola";
            this.price=30;
        }
        else if(name==2){
            this.drinks="Green Tea";
            this.price=25;
        }
        else if(name==3){
            this.drinks="Lemon Tea";
            this.price=29;
        }
        else if(name==4){
            this.drinks="Mineral Water";
            this.price=20;
        }
        this.amount=count;
        this.drinks_num=name;
    }
    private String drinks;
    private int amount;
    private int drinks_num;
    private int price;

    public void setAmount(int amount) {
        this.amount = this.amount+amount;
    }
    public String getDrinks(){
        return this.drinks;
    }
    public int getAmount(){
        return this.amount;
    }
    public int getDrinks_num(){
        return this.drinks_num;
    }
    public int getPrice(){
        return this.price;
    }
    public int getTotalPrice(){
        return this.price*this.amount;
    }
}