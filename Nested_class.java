class Outer
{
    int outer_x=100;
    void test()
    {
        inner inner=new inner();
        inner.display();
    }
    class inner
    {
        void display()
        {
            System.out.println("Display outer_x :"+outer_x);
        }
    }
}
class Nested_class
{
    public static void main(String args[])
    {
        Outer outer=new Outer();
        outer.test();
    }
}