/* @Description
 * polymorphism- dynamic method dispatch using Abstract class
 *
 * @author surendra
 */

abstract class Data1
{
    int a,b;
    
    abstract void cal();
}

class Abst extends Data1
{
    void cal()
    {
        System.out.println("sum is "+(a+b));
    }
}

class Ract extends Data1
{
    void cal()
    {
        System.out.println("product is "+(a*b));
    }
}

public class AbstractClassDemo 
{
    public static void main(String[] args)
    {
        Data1 d=new Abst();        
        Ract t=new Ract();
        
        d.a=5;
        d.b=10;
        
        t.a=7;
        t.b=3;
        
        d.cal();
        d=t;
        d.cal();
        
    }
}
/*
 * Data1 d=new Data1();
 * We cannot allocate the memory for an abstract class.
 * But we can allocate the subclass memory for an abstract class.
 * example: 
 *          Data1 d=new Abst();
 */
