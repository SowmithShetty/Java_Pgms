interface Vehicle
{
    void starting();
    default void sound()
    {
        System.out.println("Honking");

    }
}
class Car implements Vehicle{
    public void starting()
    {
        System.out.println("Car starting....");
    }
    
}
class Truck implements Vehicle{
    public void starting()
    {
        System.out.println("Truck is starting.....");
    }
    
}
public class defaultinterfacemethod
{
    public static void main(String[] args)
    {
        Vehicle D=new Car();
        Vehicle C=new Truck();
        D.starting();
        D.sound();
        C.starting();
        C.sound();

    }

}