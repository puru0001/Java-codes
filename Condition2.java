import java.util.*;

public class Condition2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number = ");
        int x = sc.nextInt();
        
        if(x % 2 == 0){
            System.out.println(x+" is an even number");
        }
        else 
        System.out.println(x+" is an odd number");
    }
}