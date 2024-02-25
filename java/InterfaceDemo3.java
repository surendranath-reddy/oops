/* @Description
 * A class should first extend a class and then implement an interface
 *
 * @author surendra
 */
interface Inter3
{
    public void sum(int x,int y);
}

 class Face2
{
    public void prod(int x,int y)
    {
        System.out.println("product is "+(x*y));
    }
}

class Data5 extends Face2 implements Inter3
{
    public void sum(int x,int y)
    {
        System.out.println("sum is "+(x+y));
    }
            
    public void diff(int x,int y)
    {
        System.out.println("Difference is "+(x-y));
    }
}

public class InterfaceDemo3 
{
    public static void main(String[] args)
    {
        Face2 f=new Data5();
        
        //f.sum(50,30);
        f.prod(50, 30);
        //f.diff(50,30);
        
        Inter3 i=new Data5();
        
        i.sum(30, 10);
        //i.prod(30,10);
        //i.diff(30,10);
    }
}
