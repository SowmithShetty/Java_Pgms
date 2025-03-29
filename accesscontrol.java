class person
{
    private int age;
    public int height;
    person(int a,int h)
    {
        age=a;
        height=h;
    }
    public int getage()
    {
        return age;
    }
}
class accesscontrol
{
    public static void main(String args[])
    {
        person p1=new person(21,170);
        //System.out.println("Age of P1:"+p1.age);
        //int tempage = p1.getage();
        System.out.println("Age of the P1 is :"+p1.getage());
        System.out.println("Height of the P1 is :"+p1.height);
    }
}