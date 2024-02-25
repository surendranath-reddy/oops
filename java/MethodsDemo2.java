/* @Description
 * Example on pass by value
 * When variables are passed as parameters it is said to be pass by value.
 *
 * @author surendra
 */

public class MethodsDemo2 
{
    void change(int x,int y)
    {
        x=x+100;
        y=y+100;
        
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
class PassByValue
{
    public static void main(String[] args)
    {
        int a=5,b=10;
        MethodsDemo2 md=new MethodsDemo2();
        
        md.change(a, b);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
