import java.util.Scanner;

public class Seventh {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity:");
		int quantity=sc.nextInt();
		{
			String var=quantity%12==0?"in dozens":"not dozens";
			System.out.println(var);
		}
		
		
		

	}

}
