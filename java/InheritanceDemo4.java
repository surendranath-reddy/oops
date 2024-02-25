/* @Description
 * Inheritance and constructors
 * super class constructor get's activated prior to sub class constructor.
 *
 * @author surendra
 */
class Parent
{
    Parent()
    {
        System.out.println("Im from class Parent");
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Im from class Child");
    }
}

public class InheritanceDemo4 
{
    public static void main(String[] args)
    {
        Child t=new Child();
    }
}
