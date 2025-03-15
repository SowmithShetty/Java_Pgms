import java.util.*;
class Add_numbers_input
 {
	
 	public static void main(String args[])
	{
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a:\n");
		a=sc.nextInt();
		System.out.print("Enter the value of b:\n");
		b=sc.nextInt();
		c=a^b;		
		System.out.print("Sum of numbers =\n"+ c);
		
	}
}