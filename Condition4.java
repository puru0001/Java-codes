import java.util.*;

public class Condition4{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number = ");
        int button = sc.nextInt();
        
        if(button == 1){
            System.out.println("Helo");
        }
        else if(button == 2){
            System.out.println("Namaste");
        }
        else if(button == 3){
            System.out.println("Bonjur");
        }
        else 
            System.out.println("Invalid button");
    }
}