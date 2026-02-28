/*Program name-Program using Hierachical inheritance
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 19.08.2024
 */
import java.util.Scanner;
class Animal{
    void smell(){
        System.out.println("Smelling");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
class Puppy extends Animal{
    void weep(){
        System.out.println("Weeping");
    }
}
class Hierachicalineritance{
    public static void main(String[] args) {
        Puppy p= new Puppy();
            p.weep();
            p.smell();
        Dog b= new Dog();
            b.bark();
            b.smell();

    }
}