import java.util.Scanner;
public class Seventeen {
	public static void main(String[] args) {
			int a;
			int b;
			int c;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of a:");
			a=sc.nextInt();
			System.out.println("Enter the value of b:");
			b=sc.nextInt();
			System.out.println("Enter the value of c:");
			c=sc.nextInt();
			if(a==b || b==c ||c==a)
			{
				System.out.println("Three nos are equal");
			}
			else
			{
				System.out.println("not equal");
			}

			}

}


