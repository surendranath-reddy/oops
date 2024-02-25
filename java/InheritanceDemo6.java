/* @Description
 * A super class object referencing to sub-class memory location
 *
 * @author surendra
 */
class First
{
    void display()
    {
        System.out.println("Hello boys");
    }
}

class Second extends First
{
    void show()
    {
        System.out.println("hi girls");
    }
}

public class InheritanceDemo6 
{
    public static void main(String[] args)
    {
        First f=new First();
        f.display();
        
        Second s=new Second();
        s.display();
        s.show();
        
        First f1=new Second();
        f1.display();
        //f1.show();
        
    }
}
