import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //creat hero------------------------------------

        Hero1 hero=new Hero1();
        System.out.print("\n");
        //creat enemy-----------------------------
        while(true) {

            Enemy1 enemy = new Enemy1();

            System.out.println("============");
            //戰鬥階段--------------------------------------------------------

            System.out.println("A Wild " + enemy.Name + " appeared!");
            System.out.println("What will " + enemy.Name + " do?");

            while (hero.Hp > 0 && enemy.Hp > 0) {


                System.out.println(hero.Name + "'s Hp: " + hero.Hp);
                System.out.println(enemy.Name + "'s Hp: " + enemy.Hp);
                System.out.println("1.Attack 2.Do nothing");
                int if_heroAttack = scanner.nextInt();
                if (if_heroAttack == 1) {
                    int hurt = hero.Atk + hero.WeaponAtk;
                    System.out.println(hero.Name + " use " + hero.Weapon + " and hurt " + enemy.Name +" "+hurt + " points.");
                    enemy.round_hp(hero.Atk, hero.WeaponAtk);
                    if(enemy.Hp<=0){
                        break;
                    }
                    hero.round_hp(enemy.Atk);
                }
                if (if_heroAttack == 2) {
                    System.out.println(hero.Name + " is doing nothing.");
                    hero.round_hp(enemy.Atk);
                }
            }
            //第四階段---------------------------------------------------
            if (hero.Hp > 0) {
                System.out.println(hero.Name + " win!");
                System.out.println(enemy.Name + " dropped item " + enemy.DropItem + " left on the ground.");
                System.out.println("Want another adventure?");
                System.out.println("1. Yes 2. No");
                int restartORover = scanner.nextInt();
                if(restartORover==2){
                    break;
                }

            }
            if(enemy.Hp>0){
                System.out.println(enemy.Name + " win!");
                System.out.println(hero.Name + "'s weapon " + hero.Weapon + " left on the ground.");
                break;
            }
        }
        System.out.println("Game Over");


    }


}
class Role1{
    Role1(){
    }
    String Name;
    int Hp;
    int Atk;
    String Weapon;
    //String getName(){
       // return Name;
    //}
    //int getHp(){
        //return Hp;
    //}
    //int getAtk(){
        //return Atk;
    //}
}
class Hero1 extends Role1{
    Scanner scanner = new Scanner(System.in);
    Hero1(){
        System.out.println("Please Create a hero: ");
        System.out.print("Name: ");
        super.Name=scanner.next();
        System.out.print("Hp: ");
        super.Hp=scanner.nextInt();
        System.out.print("Atk: ");
        super.Atk=scanner.nextInt();
        System.out.print(this.Name+"'s Weapon: ");
        this.Weapon=scanner.next();
        System.out.print(this.Name+"'s Weapon Atk: ");
        this.WeaponAtk=scanner.nextInt();
    }
    String Weapon;
    int WeaponAtk;
    void round_hp(int Enemy_Atk){
        super.Hp=super.Hp-Enemy_Atk;
    }
    //String getWeapon(){
        //return Weapon;
   // }
    //int getWeaponAtk(){
       // return WeaponAtk;
   // }
}

class Enemy1 extends Role1{
    Scanner scanner = new Scanner(System.in);
    Enemy1(){
        System.out.println("Please Create an enemy: ");
        System.out.print("Name: ");
        super.Name=scanner.next();
        System.out.print("Hp: ");
        super.Hp=scanner.nextInt();
        System.out.print("Atk: ");
        super.Atk=scanner.nextInt();
        System.out.print("DropItem: ");
        this.DropItem=scanner.next();
    }
    String DropItem;
    void round_hp(int hero_Atk,int hero_weapon_Atk){
        super.Hp = super.Hp - (hero_Atk) - (hero_weapon_Atk);
    }
    //String getDropItem(){
        //return DropItem;
   // }
}