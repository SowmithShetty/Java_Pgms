class A
{ 
    int i,j;    
    A(int a,int b)
    {
        i=a;
        j=b;
    }
void show()
{
    System.out.println("I am parent");
}
    
}
class B extends A{
    int k;
    B(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show()
    {
        System.out.println("I am child");
    }

}
class Polymorphism_1
{
    public static void main(String[] args) {
        A a1;
        B b1=new B(1,2,3);
        a1=b1;
        a1.show();
        /*A a1=new A(1,2);
        B b1;
        b1=a1;
        b1.show();error: incompatible types: A cannot be converted to B*/

}
}
