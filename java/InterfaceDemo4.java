/* @Description
 * Interface variables are static and final
 *
 * @author surendra
 */
interface Inter4
{
    int a=50;
    public void sum(int x,int y);
}

class Data6 implements Inter4
{
    int b;
    
    public void sum(int x,int y)
    {
        //a=a+100;
        System.out.println("Sum is "+(x+y+a));
    }
    
    void prod()
    {
        b=30;
        b+=10;
        //a=70;
        
        System.out.println("Product is "+(a*b));
    }
}

public class InterfaceDemo4 
{
    public static void main(String[] args)
    {
        Inter4 i=new Data6();
        
        i.sum(10, 20);
        
        Data6 d=new Data6();
        d.sum(50, 20);
        d.prod();
        
        System.out.println("Value of a is "+Data6.a);
        System.out.println("Value of a is "+Inter4.a);
    }
}

/*
 * A static variable can be called without creating
 * object by using an interface or a class
 */
