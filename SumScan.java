import java.util.*;

public class SumScan {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st number = ");
        int x = sc.nextInt();
        System.out.println("Please enter 2nd number number = ");
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("Please enter any word = ");
        String s = sc.next();
        System.out.println("Please enter any string = ");
        String Str = sc.nextLine();
        System.out.println("Sum of those two numbers = "+sum);
        System.out.println("The word yopu have entered = "+s);
        System.out.println("The String you have entered = "+Str);

        /*sc.next  ->  it will print only one word 
        sc.nextLine()  ->  it will print the whole string 
        sc.nextInt()    ->  it will take the integer as a input
        sc.nextFloat()    ->  it will take the float value as a input       
        sc.nextDouble()    ->  it will take the double value as a input       
        sc.nextLong()    ->  it will take the long value as a input       */
    }
}