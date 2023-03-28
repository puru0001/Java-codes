import java.util.*;

/* print this butrefly

*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 

*/

public class Pattern10{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a butterfly pattern");
        int n=5;
        for(int i=1;i<=n;i++){      //loop for upper part of bugtterfly
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=2*(n-i); k>=1; k--){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){          //loop for lower part of butterfly
            for(int j=i;j>=1;j--){
                System.out.print("* ");    
            }
            for(int j=2*(n-i); j>=1; j--){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("* ");    
            }
            System.out.println();
        }    
    }
}