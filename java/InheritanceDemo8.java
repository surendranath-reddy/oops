/* @Description
 * class with dtat members- super class referencing to sub-class: overriding
 *
 * @author surendra
 */
class First2
{
    int a;
    void show()
    {
        System.out.println("a= "+a);
    }
}

class Second2 extends First2
{
    int b;
    void show()
    {
        b=100;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}

public class InheritanceDemo8 
{
    public static void main(String[] args)
    {
        First2 f=new Second2();
        
        f.a=50;
        //f.b=70;
        
        f.show();
    }
}
