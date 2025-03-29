class person
{
    int age,height;
    static int totalpersons=0;
    public static void havingfun()
    {
        System.out.println("Good morning");
    }
    person(int a,int h)
    {
        age=a;
        height=h;
        totalpersons += 2;
    }
}
class Static_topic
{
    public static void main(String args[])
    {
        person p1=new person(28,170);
        person p2=new person(25,180);
        System.out.println("P1.total_persons :"+p1.totalpersons);
        System.out.println("P2.total_persons :"+p2.totalpersons);
        person.havingfun();
        p1.havingfun();
    }
}