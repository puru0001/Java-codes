import java.util.*;

public class Condition{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age = ");
        int age = sc.nextInt();
        
        if(age <= 17){
            System.out.println("Oh dear you are a child!");
        }
        else if(age >=18 && age <=50){
            System.out.println("You are adult!");
        }
        else if(age>=51){
            System.out.println("You are getting old!");
        }
    }
}