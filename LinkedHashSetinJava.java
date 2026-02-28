import java.util.*;
public class LinkedHashSetinJava{
    public static void main(String[] args){
        LinkedHashSet<String> sets= new LinkedHashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names to add");
        while (true) {
            System.out.print("Nmaes: ");
            String set = sc.next();
            sets. add(set);
        }
        Iterator<String> iterator =sets.iterator();
            System.out.println("name elements:");
    } 
}