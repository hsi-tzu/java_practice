/**
 Practice 4
 Student Number：108601503
 Course：2022-CE1004-A
 */
import java.util.*;
class Pet {
    void speak(){
        System.out.println("I'm not a pet!");
    }
}

class Cat extends Pet {
    void speak(){
        System.out.println("I'm a Cat!");
    }
}

class Dog extends Pet {
    void speak(){
        System.out.println("I'm a Dog!");
    }
}

class  newborn_Cat extends Cat {
    void speak(){
        System.out.println("I can't speak but I can meow.");
    }
}

class  newborn_Dog extends Dog {
    void speak(){
        System.out.println("I can't speak but I can woof.");
    }
}

public class P4_108601503 {
    public static void main(String[] args) {
        // 以下不要改
        Pet putin = new Pet();
        Cat neko  = new Cat();
        Dog inu   = new Dog();
        newborn_Cat meow = new newborn_Cat();
        newborn_Dog woof = new newborn_Dog();
        putin.speak();
        neko.speak();
        inu.speak();
        meow.speak();
        woof.speak();
    }
}

