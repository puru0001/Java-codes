 import java.util.*;

public class Pattern1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a solid ractange pattern");
        //int x = sc.nextInt();
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
            System.out.print("*  ");
            }
            System.out.println();
        }
    }
}