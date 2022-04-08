package stu_108601503;

import java.util.Scanner;
import java.util.*;
public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int round= scanner.nextInt();
        while(round!=0){
            int e_hp=scanner.nextInt();
            int e_atk=scanner.nextInt();
            float e_power=scanner.nextFloat();
            dragorn enemy=new dragorn(e_hp,e_atk,e_power);
            int my_hp=scanner.nextInt();
            int my_atk=scanner.nextInt();
            float my_power=scanner.nextFloat();

            int round1=scanner.nextInt();
            int round2=scanner.nextInt();
            int round3=scanner.nextInt();
            if(round1==1){
                dress me=new dress(my_hp,my_atk,my_power);
                while(true){
                    if(enemy.getHP()<=0 || me.getHP()<0){
                        break;
                    }
                    enemy.ene_addHp();
                    if(enemy.getPower()!=1){
                        me.setHP(enemy.getAtk());
                    }
                    else{
                        me.setHP(enemy.getAtk()*1.1);
                    }

                }

            }
            if(round1==2){
                dragorn me=new dragorn(my_hp,my_atk,my_power);
            }
            if(round1==3){
                turtle me=new turtle(my_hp,my_atk,my_power);
            }
            round= scanner.nextInt();



        }

    }
}

class dress{
    Scanner scanner = new Scanner(System.in);
    dress (int HP,int Atk,float power){
        this.HP=HP*1.2;
        this.HP_o=HP*1.2;
        this.Atk=Atk*1;
        this.power=power;
    }
    private double HP_o;
    private double HP;
    private double Atk;
    private double power;
    void setHP(double beAtk){
        this.HP=this.HP-beAtk;
    }
    void addPower(){
        if(power<1){
            power=power+0.25;
            if(power>1){
                power=1;
            }
        }
    }
    double getPower(){
        return this.power;
    }
    double getAtk(){
        return this.Atk;
    }
    double getHP(){
        return this.HP;
    }
    void ene_addHp(){
        if(this.HP<this.HP_o)
        this.HP=this.HP+this.Atk*0.2;
    }
}
class dragorn{
    Scanner scanner = new Scanner(System.in);
    dragorn (int HP,int Atk,float power) {
        this.HP = HP * 0.8;
        this.HP_o = HP * 0.8;
        this.Atk = Atk * 1.2;
        this.power = power;
    }
    private double HP_o;
    private double HP;
    private double Atk;
    private double power;
    void setHP(double beAtk){
        this.HP=this.HP-beAtk;
    }
    void addPower(){
        if(power<1){
            power=power+0.25;
            if(power>1){
                power=1;
            }
        }
    }
    double getPower(){
        return this.power;
    }
    double getAtk(){
        return this.Atk;
    }
    double getHP(){
        return this.HP;
    }
    void ene_addHp(){
        if(this.HP<this.HP_o)
            this.HP=this.HP+this.Atk*0.2;
    }
}
class turtle{
    Scanner scanner = new Scanner(System.in);
    turtle  (int HP,int Atk,float power){
        this.HP=HP*0.9;
        this.HP_o=HP*0.9;
        this.Atk=Atk*0.9;
        this.power=power;
    }
    private double HP_o;
    private double HP;
    private double Atk;
    private double power;
    void setHP(double beAtk){
        this.HP=this.HP-beAtk;
    }
    void addPower(){
        if(power<1){
            power=power+0.25;
            if(power>1){
                power=1;
            }
        }
    }
    double getPower(){
        return this.power;
    }
    double getAtk(){
        return this.Atk;
    }
    double getHP(){
        return this.HP;
    }
    void ene_addHp(){
        if(this.HP<this.HP_o)
            this.HP=this.HP+this.Atk*0.2;
    }
}
