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
        System.out.println("\nMy name is :" + name +"\nI am human. My age is :" + age);

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
class PGStudent extends Student
{
    String specialization;
    PGStudent(String n,int a,String sID,String std,String spec)
    {
        super(n,a,sID,std);
        specialization=spec;
    }
    void research()
    {
        System.out.println("I am a post graduate student specializing in :"+specialization);
    }
}
public class MultipleInheritance
{
    public static void main(String[] args)
    {
        Human h=new Human("Tim",21);
        Student s=new Student("David",19,"S18","12th standard");
        PGStudent pgs=new PGStudent("Rahul",20,"S19","M.E in CSE","CyberSecurity");
        h.speak();
        s.speak();
        pgs.speak();
        pgs.research();
    }
}
