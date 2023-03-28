import java.util.*;
// wap to program 
//         1
//       2 1 2
//     3 2 1 2 3 
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5
public class Pattern13{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the value of n = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=(n-i); k>=1; k--){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}