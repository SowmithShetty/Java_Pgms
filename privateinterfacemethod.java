interface greeting
{
    private void log(String msg)
    {
        System.out.println("LOG:"+msg);
    }
    default void sayHello()
    {
        log("Hello");
    }
    default void sayBye()
    {
        log("GoodBye");
    }
}
class greeter implements greeting 
{
    
}
public class privateinterfacemethod
{
    public static void main(String[] args)
    {
        greeter g=new greeter();
        g.sayHello();
        g.sayBye();

    }
}