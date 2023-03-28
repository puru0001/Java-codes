import java.util.Scanner;
// Code to seprate integer from string...
public class seprate {

	// Function to return the modified string
	public static String extractInt(String str)
	{
		// Replacing every non-digit number
		// with a space(" ")
		str = str.replaceAll("[^0-9]", ""); // regular expression
		return str;
	}
	public static String extractStr(String str)
	{
		// Replacing every non-digit number
		// with a space(" ")
		str = str.replaceAll("[^a-z]", ""); // regular expression
		return str;
	}
	// Driver code
	public static void main(String[] args)
	{
		System.out.println("Enter any word hsving integer also ");
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++){
        String str = sc.nextLine();
		System.out.println(extractStr(str)+"       "+extractInt(str));
		}
	}
}

