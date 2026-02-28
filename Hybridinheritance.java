import java.util.Scanner;
class Grandfather{
    public void show(){
        System.out.println("I am grandfather.");
    }
}
class Father extends Grandfather{
    public void show(){
        System.out.println("I am the Father");
    }
}
class Son extends Father{
    public void show(){
        System.out.println("I am the son");
    }
}
class Hybridinheritance extends Father{
    public void show(){
        System.out.println("I am the Daughter");
    }
    public static void main(String[] args) {
        Hybridinheritance h= new Hybridinheritance();
            h.show();
    }
}