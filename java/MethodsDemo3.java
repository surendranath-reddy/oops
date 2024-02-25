/* @Description
 * call by reference
 * When formal parameters are changed the corresponding actual parameters get's changed.
 * Both formal and actual parameters share common memory.
 *
 * @author surendra
 */

public class MethodsDemo3 
{
    int a,b;
    void change(MethodsDemo3 x)
    {
        x.a=100;
        x.b=100;
    }
    void show()
    {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
class CalByRef
{
    public static void main(String[] args)
    {
        MethodsDemo3 md=new MethodsDemo3();
        
        md.a=5;
        md.b=10;
        
        md.show();
        md.change(md);
        md.show();
    }
}
