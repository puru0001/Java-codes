import java.util.*;

public class Calc{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number = ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number = ");
        int y = sc.nextInt();
        
        System.out.println("press 1 for sum");
        System.out.println("press 2 for substract");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        System.out.println("press 5 for modulos");
        int a = sc.nextInt();
        
        switch (a) {
            case 1:
                int sum = x+y;
                    System.out.println("The sum of "+x+" and "+y+" is "+sum);
                    break;
            case 2: 
                int sub = x-y;
                    System.out.println("The substraction of "+x+" and "+y+" is "+sub);
                    break;
            case 3:
                int mul = x*y;
                    System.out.println("The multiplication of "+x+" and "+y+" is "+mul);
                    break;
            case 4:
                int div = x/y;
                    System.out.println("The division of "+x+" and "+y+" is "+div);
                    break;
            case 5:
                int mod = x%y;
                    System.out.println("The reminder after division (mod) of "+x+" and "+y+" is "+mod);
                    break;
            default:
                System.out.println("invalid button");
        }
    }
}