/*Program name-Program using Multilevel inheritance
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
class Puppy extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
}
class Multilevelinheritance{
    public static void main(String[] args) {
        Puppy p= new Puppy();
            p.weep();
            p.bark();
            p.smell();

    }
}