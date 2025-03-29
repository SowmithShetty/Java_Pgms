class Test
{
    void add10(int a)
    {
         a=a+10;

    }
}
class Passbyvalue
{
    public static void main(String args[])
    {
        Test ob = new Test();
        int a=15;
        System.out.println("Value of a before call :"+a);
        ob.add10(a);
        System.out.println("Value of a after call :"+a);
    }
}