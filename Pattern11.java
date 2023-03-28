import java.util.*;
// wap to print 
//         * * * * * 
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *
public class Pattern11{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the value of n = ");
        int n = sc.nextInt();
        for(int k=n;k>=1; k--){
            for(int i=(k-1);i>=1;i--){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}