interface Animal
{
    void makesound();
    void eating();
}
class Dog implements Animal{
    public void makesound()
    {
        System.out.println("Bow-Bow");
    }
    public void eating()
    {
        System.out.println("Dog is eating food");
    }
}
class Cat implements Animal{
    public void makesound()
    {
        System.out.println("Meow");
    }
    public void eating()
    {
        System.out.println("Cat is eating food");
    }
}
public class interfacedemo
{
    public static void main(String[] args)
    {
        Animal D=new Dog();
        Animal C=new Cat();
        D.makesound();
        D.eating();
        C.makesound();
        C.eating();

    }

}