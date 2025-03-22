//passing objects in the constructor
class Box
{
	double length,width,height;
	
	Box(double l,double w,double h)
	{
		length=l;
		width=w;
		height=h;
	}
    Box(Box ob)
    {
        length=ob.length;
		width=ob.width;
		height=ob.height;
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
public class Box_clone
{
	public static void main(String[] args)
	{
		Box myBox= new Box(1,2,3);
		Box mycloneBox= new Box(myBox);

		myBox.displayDetails();
		mycloneBox.displayDetails();

	}
}
		

		
		
