import java.util.Scanner;
class exceptionhandling
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ch, s;
        System.out.println("Enter number of chocolates");
        ch = sc.nextInt();
        System.out.println("Enter number of students");
        s = sc.nextInt();

        try{
            int a = ch / s;
            System.out.println("Each student gets " + a + " chocolates.");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by 0 ");
        }
        System.out.println("After catch statement");
        sc.close();
    }
}
