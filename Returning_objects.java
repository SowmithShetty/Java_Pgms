class person
{
    int height;
    person(int h)
    {
        height=h;
    }
    person add10(person p)
    {
        person temp=new person(height+10);
        return temp;
    }
}
class Returning_objects
{
    public static void main(String args[])
    {
        person p1=new person(150);
        person p2;
        p2=p1.add10(p1);
        System.out.println("Height of the first person :"+p1.height);
         System.out.println("Height of the second person :"+p2.height);

    }


}