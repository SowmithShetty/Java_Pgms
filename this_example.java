class Box
{
	double length,width,height;
	
	Box(double length,double width,double height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
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
public class this_example
{
	public static void main(String[] args)
	{
		Box Box1= new Box(1,2,3);
		

		Box1.displayDetails();
		

	}
}
		

		
		
