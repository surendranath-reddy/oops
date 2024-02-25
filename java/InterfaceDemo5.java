/* @Description
 * Dynamic binding- polymorphism through interfaces
 *
 * @author surendra
 */

interface Data7
{
    public void cal(int x,int y);
}

class Inter5 implements Data7
{
    public void cal(int x,int y)
    {
        System.out.println("Sum is "+(x+y));
    }
}

class Face3 implements Data7
{
    public void cal(int x,int y)
    {
        System.out.println("Product is "+(x*y));
    }
}

public class InterfaceDemo5 
{
    public static void main(String[] args)
    {
        Data7 d=new Inter5();        
        Face3 f=new Face3();
        
        d.cal(5, 10);
        d=f;
        d.cal(5, 10);
    }
}
