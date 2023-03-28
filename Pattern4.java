import java.util.*;

public class Pattern4{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a solid ractange pattern");
        //int x = sc.nextInt();
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            } System.out.println();
        }
    }
}