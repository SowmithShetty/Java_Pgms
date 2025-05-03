import java.util.Scanner;
class safedivision
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter first number ");
        n1 = sc.nextInt();
        while(true){
        try{
            System.out.println("Enter second number ");
            n2 = sc.nextInt();
            int r=n1/n2;
            System.out.println("Result"+r);
            break;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: "+e.getMessage()+"Please try again");
        }
    }
}
}
