public class Human 
{
    String name;
    int age;
    Human()
    {
        age=0;
        System.out.println("\nI am just born");

    }
    Human(String n,int a)
    {
        name=n;
        age=a;
    }
    void speak()
    {
        System.out.println("My name is :" + name +"\nI am human. My age is :" + age);

    }
}
class Student extends Human
{
        
    
    String studentID;
    String standard;

    Student(String n,int a,String sID,String std)
    {
        super(n,a);
        studentID=sID;
        standard=std;
    }
    void speak()
    {
            
        super.speak();
        System.out.println("I am studying in standard :"+ standard +"\nMy student ID is :"+ studentID);
    }

}
public class InheritanceExample
{
    public static void main(String[] args)
    {
        Human h=new Human("Tim",21);
        Student s=new Student("David",19,"S18","12th standard");
        h.speak();
        s.speak();
    }
}
