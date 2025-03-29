class factorial
{
    int fact(int n)
    {
        int result;
        if(n==1)
        return 1;
        result=fact(n-1)*n;
        return result;
    }
}
class Recursion
{
    public static void main(String args[])
    {
        factorial f=new factorial();
        System.out.println("factorial of 5 is :"+f.fact(5));
        System.out.println("factorial of 8 is :"+f.fact(6));
    }
}