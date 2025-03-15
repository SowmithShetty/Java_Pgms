class Box
{
	double length,width,height;
	Box(double w,double h)
	{
		width=w;
		height=h;
	}
	Box()
	{
		length=1;
		width=1;
		height=1;
	}
	
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
public class constructor_overloading
{
	public static void main(String[] args)
	{
		Box Box5;
		Box Box1= new Box(1,2,3);
		Box5 = Box1;
		Box Box2= new Box(3,4,6);
		Box Box3= new Box();
		Box Box4= new Box(2,3);

		Box1.displayDetails();
		Box2.displayDetails();
		Box3.displayDetails();
		Box4.displayDetails();
		Box5.displayDetails();
	}
}
