/**
 Practice 5
 Student Number：108601503
 Course：2022-CE1004-A
 */
import java.util.*;
public class P5_108601503 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //creat hero------------------------------------
        System.out.println("Please Create a hero: ");
        System.out.print("Name: ");
        String hero_name= scanner.next();
        System.out.print("Hp: ");
        int hero_hp=scanner.nextInt();
        System.out.print("Atk: ");
        int hero_atk=scanner.nextInt();
        System.out.print(hero_name+"'s Weapon: ");
        String hero_Weapon=scanner.next();
        System.out.print(hero_name+"'s Weapon Atk: ");
        int hero_weapon_atk=scanner.nextInt();
        Hero hero=new Hero(hero_name,hero_hp,hero_atk,hero_Weapon,hero_weapon_atk);
        System.out.print("\n");
        //creat enemy-----------------------------
        while(true) {

            System.out.println("Please Create an enemy: ");
            System.out.print("Name: ");
            String enemy_name = scanner.next();
            System.out.print("Hp: ");
            int enemy_hp = scanner.nextInt();
            System.out.print("Atk: ");
            int enemy_atk = scanner.nextInt();
            System.out.print("DropItem: ");
            String enemy_DropItem = scanner.next();
            Enemy enemy = new Enemy(enemy_name, enemy_hp, enemy_atk, enemy_DropItem);

            System.out.println("============");
            //戰鬥階段--------------------------------------------------------

            System.out.println("A Wild " + enemy.getName() + " appeared!");
            System.out.println("What will " + enemy.getName() + " do?");

            while (hero.getHp() > 0 && enemy.getHp() > 0) {


                System.out.println(hero.getName() + "'s Hp: " + hero.getHp());
                System.out.println(enemy.getName() + "'s Hp: " + enemy.getHp());
                System.out.println("1.Attack 2.Do nothing");
                int if_heroAttack = scanner.nextInt();
                if (if_heroAttack == 1) {
                    int hurt = hero.getAtk() + hero.getWeaponAtk();
                    System.out.println(hero.getName() + " use " + hero.getWeapon() + " and hurt " + enemy.getName() +" "+hurt + " points.");
                    enemy.round_hp(hero.getAtk(), hero.getWeaponAtk());
                    if(enemy.getHp()<=0){
                        break;
                    }
                    hero.round_hp(enemy.getAtk());
                }
                if (if_heroAttack == 2) {
                    System.out.println(hero.getName() + " is doing nothing.");
                    hero.round_hp(enemy.getAtk());
                }
            }
            //第四階段---------------------------------------------------
            if (hero.getHp() > 0) {
                System.out.println(hero.getName() + " win!");
                System.out.println(enemy.getName() + " dropped item " + enemy.getDropItem() + " left on the ground.");
                System.out.println("Want another adventure?");
                System.out.println("1. Yes 2. No");
                int restartORover = scanner.nextInt();
                if(restartORover==2){
                    break;
                }

            }
            if(enemy.getHp()>0){
                System.out.println(enemy.getName() + " win!");
                System.out.println(hero.getName() + "'s weapon " + hero.getWeapon() + " left on the ground.");
                break;
            }
        }
        System.out.println("Game Over");


    }
}
class Role{
    Role(String Name,int Hp,int Atk){
        this.Name=Name;
        this.Hp=Hp;
        this.Atk=Atk;
    }
    String Name;
    int Hp;
    int Atk;
    String Weapon;
    String getName(){
        return Name;
    }
    int getHp(){
        return Hp;
    }
    int getAtk(){
        return Atk;
    }
}
class Hero extends Role{
    Hero(String Name,int Hp,int Atk,String Weapon,int WeaponAtk){
        super(Name,Hp,Atk);
        this.Weapon=Weapon;
        this.WeaponAtk=WeaponAtk;
    }
    String Weapon;
    int WeaponAtk;
    void round_hp(int Enemy_Atk){
        super.Hp=super.Hp-Enemy_Atk;
    }
    String getWeapon(){
        return Weapon;
    }
    int getWeaponAtk(){
        return WeaponAtk;
    }
}

class Enemy extends Role{
    Enemy(String Name,int Hp,int Atk,String DropItem){
        super(Name,Hp,Atk);
        this.DropItem=DropItem;
    }
    String DropItem;
    void round_hp(int hero_Atk,int hero_weapon_Atk){
        super.Hp = super.Hp - (hero_Atk) - (hero_weapon_Atk);
    }
    String getDropItem(){
        return DropItem;
    }
}
