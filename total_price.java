import java.util.Scanner;
class total_price
{
public static void main(String args [])
{
Scanner scn=new Scanner (System.in);
System.out.println ("Enter the Quantity:");
int qty=scn.nextInt();
System.out.println("Enter the Unit Price:");
int up=scn.nextInt();
int total_price;
total_price= qty * up;

System.out.println("The total Price:Rs." +total_price);
System.out.println("What is Holi discount ?");
double discount=scn.nextDouble();
double t_p=total_price*(discount/100);
double tpd=total_price-t_p;
System.out.println(" Discount offered:Rs." +t_p);
System.out.println("The total Price after discount:Rs." +tpd);
scn.close();
}
}
