/* @Description
 * Class implementing multiple interfaces
 *
 * @author surendra
 */
interface Inter1
{
    public void sum(int x,int y);
}

interface Face
{
    public void prod(int x,int y);
}

class Data3 implements Inter1,Face
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

public class InterfaceDemo1 
{
    public static void main(String[] args)
    {
        Inter1 i=new Data3();
        
        i.sum(15, 10);
        //i.pro(15, 10);
        //i.diff(15,10);
        
        Face f=new Data3();
        
        //f.sum(15,30);
        f.prod(50, 30);
        //f.diff(50,30);
    }
}
