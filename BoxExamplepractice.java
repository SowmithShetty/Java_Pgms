import java.util.*;
class Box
{
	float length,width,height;
	
	
	float calculateVolume()
	{
		return length*width*height;
	}
	float calculateSurface()
	{
		return 2*(length*width +length*height+width*height);
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length,width and height:\n");
		length=sc.nextFloat();
		width=sc.nextFloat();
		height=sc.nextFloat();
	}

	void displayDetails()
	{
		System.out.println("Box Dimensions :"+length+"x"+width+"x"+height);
		System.out.println("Volume :" +calculateVolume());
		System.out.println("Surface Area:" +calculateSurface());
	}
}
public class BoxExamplepractice
{
	public static void main(String[] args)
	{
		Box Box1= new Box();
		Box Box2= new Box();
		Box Box3= new Box();

		Box1.input();
		Box2.input();
		System.out.println("Box 1");
		Box1.displayDetails();
		System.out.println("Box 2");
		Box2.displayDetails();
		System.out.println("Box 3");
		Box3.displayDetails();
	}
}
		

		
		

