import java.util.Scanner;
public class Updatearray{
    public static void main(String[] args) {
        int a[]={12, 13, 9, 17, 23, 15};

        a[1]= 23;
        a[3]= 27;
        a[5]= 5;

        for (int n : a){
            System.out.print(n+" ");
        }
    }
}