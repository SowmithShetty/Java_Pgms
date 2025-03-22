class BoxObjectParameter
{
	double l,w,h;
	BoxObjectParameter(double w,double h)
	{
		this.w=w;
		this.h=h;
	}
	BoxObjectParameter()
	{
		this.l=1;
		this.w=1;
		this.h=1;
	}
	
	BoxObjectParameter(double l,double w,double h)
	{
		this.l=l;
		this.w=w;
		this.h=h;
	} 
    boolean equals(BoxObjectParameter o)
	{
		if(o.l==this.l && o.w ==this.w && o.h== this.h )
		return true;
		else
		return false;
	}
	
}
public class Box_boolean
{
	public static void main(String[] args)
	{
		BoxObjectParameter BoxObjectParameter1= new BoxObjectParameter(1,2,3);
		BoxObjectParameter BoxObjectParameter2= new BoxObjectParameter(3,4,6);
		BoxObjectParameter BoxObjectParameter3= new BoxObjectParameter(2,3,5);

		if(BoxObjectParameter3.equals(BoxObjectParameter1)){
			System.out.println("Box1 and Box3 are equal");}
			else{
			System.out.println("Box1 and Box3 are not equal");
		}
		if(BoxObjectParameter2.equals(BoxObjectParameter1)){
			System.out.println("Box1 and Box2 are equal");}
			else{
			System.out.println("Box1 and Box2 are not equal");
		}
	}




		
	}


