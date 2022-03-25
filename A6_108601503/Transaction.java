package A6_108601503;

import java.util.Scanner;

public class Transaction {
    public Transaction(String name){
        this.name=name;
    }

    private String name;
    private int income;
    private int pay;
    public String getName(){
        return name;
    }
    public int getIncome(){
        return income;
    }
    public int getPay(){
        return pay;
    }
    public void setIncome(int income){
        this.income=income;
    }
    public void setPay(int pay){
        this.pay=pay;
    }

}
