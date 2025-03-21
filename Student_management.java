class Student 
{
     String name;
     int rollNum;
     String address;
     double totalMarks;
     int standard;

    Student() 
    {
        this.name = "Unknown";
        this.rollNum = 0;
        this.address = "Unknown";
        this.totalMarks = 0.0;
        this.standard = 1;
    }

    Student(String name, int rollNum, String address, double totalMarks, int standard) 
    {
        this.name = name;
        this.rollNum = rollNum;
        this.address = address;
        this.totalMarks = totalMarks;
        this.standard = standard;
    }

     void display() 
     {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Address: " + address);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Standard: " + standard);
        System.out.println();
    }

     void promote() 
     {
        if (totalMarks > 35) 
        {
            standard++;
            System.out.println(name + " has been promoted to Standard " + standard);
        } else 
        {
            System.out.println(name + " has not been promoted.");
        }
    }
}
    public class Student_management
    {
    public static void main(String[] args) 
    {
        Student student1 = new Student("Namit", 101, "3rd cross,Ashoknagar", 85.0, 11);
        Student student2 = new Student("Vignesh", 102, "1st cross,Vidyagiri ", 30.0, 11);
        Student student3 = new Student();
        System.out.println("Before Promotion:");
        student1.display();
        student2.display();
        student3.display();

        student1.promote();
        student2.promote();
        System.out.print("\n");
        System.out.println("After Promotion:");
        student1.display();
        student2.display();
    }
}
