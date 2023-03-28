import java.util.*;

public class Loop{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
            System.out.println("How much time you want to print your name ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Hello World my name is "+Name);
        }
    }
}