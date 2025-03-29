class person
{
    int height;
    void add10(person o)
    {
        o.height +=10;
    }
}
class Passbyreference
{
    public static void main(String args[])
    {
        person ob=new person();
        ob.height=150;
        System.out.println("Height before call :"+ob.height);
        ob.add10(ob);
        System.out.println("Height after call :"+ob.height);
    } 
}