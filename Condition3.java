import java.util.*;

public class Condition3{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number = ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(x == y){
            System.out.println(x+" and "+y+" are equal");
        }
        else if(x>y){
            System.out.println(x+" is greater then "+y);
        }else if(x<y)
            System.out.println(x+" is lower then "+y);
    }
}