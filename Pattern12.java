import java.util.*;
// wap to program 
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5
public class Pattern12{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the value of n = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=(n-i); k>=1; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}