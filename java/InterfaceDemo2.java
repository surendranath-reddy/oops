/* @Description
 * An interface extending another interface
 *
 * @author surendra
 */
interface Inter2
{
    public void sum(int x,int y);
}

interface Face1 extends Inter2
{
    public void prod(int x,int y);
}

class Data4 implements  Face1
{
    public void sum(int x,int y)
    {
        System.out.println("sum is "+(x+y));
    }
    
    public void prod(int x,int y)
    {
       System.out.println("product is "+(x*y)); 
    }
    
    public void diff(int x,int y)
    {
        System.out.println("Difference is "+(x-y));
    }
}

public class InterfaceDemo2 
{
    public static void main(String[] args)
    {
        Face1 f=new Data4();
        
        f.sum(50, 30);
        f.prod(50, 30);
        //f.diff(50,30);
    }
}
