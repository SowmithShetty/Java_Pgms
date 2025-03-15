class Box
{
	double length,width,height;
	
	Box(double l,double w,double h)
	{
		length=l;
		width=w;
		height=h;
	}
	double calculateVolume()
	{
		return length*width*height;
	}
	double calculateSurface()
	{
		return 2*(length*width +length*height+width*height);
	}
	

	void displayDetails()
	{
		System.out.println("Box Dimensions :"+length+"x"+width+"x"+height);
		System.out.println("Volume :" +calculateVolume());
		System.out.println("Surface Area:" +calculateSurface());
	}
}
public class BoxExample
{
	public static void main(String[] args)
	{
		Box Box1= new Box(1,2,3);
		Box Box2= new Box(3,4,6);

		Box1.displayDetails();
		Box2.displayDetails();

	}
}
		

		
		