 import java.util.*;

public class LoopProb{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //2*1=2
        System.out.println("Which table you want to print = ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}