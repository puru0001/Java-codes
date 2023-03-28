import java.util.*;

public class LoopProb2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum=0; //initializing of sum variable
            System.out.println("Enter the limit = ");
            int n = sc.nextInt(); //taking the input fom user
        for(int i=0;i<=n;i++){
            sum=sum+i; //adding the value of i in sum variable
        }
        System.out.println("The sum of netural number till "+n+" is = "+sum); //prnting the vaue of sum  //syso
    }
}