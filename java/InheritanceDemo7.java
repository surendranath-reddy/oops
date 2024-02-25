/* @Description
 * Super class object referencing to sub class: method overriding
 *
 * @author surendra
 */
class First1
{
   void show()
   {
       System.out.println("Hello boys");
   }
}

class Second1 extends First1
{
    void show()
    {
        System.out.println("Hi girls");
    }
}

public class InheritanceDemo7 
{
    public static void main(String[] args)
    {
        First1 f=new Second1();
        f.show();
    }
}
