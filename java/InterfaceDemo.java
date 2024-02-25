/* @Description
 * Interface
 *
 * @author surendra
 */
interface Inter
{
    public void sum(int x,int y);
    public void pro(int x,int y);
}

class Data2 implements Inter
{
    public void sum(int x,int y)
    {
                System.out.println("sum is "+(x+y));
    }
    
    public void pro(int x,int y)
    {
        System.out.println("Product is "+(x*y));
    }
    
    public void diff(int x,int y)
    {
        System.out.println("Difference is "+(x-y));
    }
}

public class InterfaceDemo 
{
    public static void main(String[] args)
    {
        Data2 d=new Data2();
        
        d.sum(15, 10);
        d.pro(15, 10);
        d.diff(15, 10);
        
        Inter i=new Data2();
        
        i.sum(50, 30);
        i.pro(50, 30);
        //i.diff(50,30);
    }
}
