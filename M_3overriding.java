class A
{ 
    int i,j,a,b;    
    A(int a,int b)
    {
        i=a;
        j=b;
    }
void show()
{
    System.out.println("i:"+i+"\nj:"+j);
}
    
}
class B extends A{
    int k;
    B(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show(String msg)
    {
        System.out.println(msg +k);
    }

}
class M_3overriding
{
    public static void main(String[] args) {
        B b1=new B(1,2,3);
        b1.show("This is k:");
        b1.show();
}
}