/* @Description
 * Methods with parameters
 *
 * @author surendra
 */

public class MethodsDemo
{
    int sno;
    private int m1,m2;
    String name;
    
    void getMarks(int x,int y)
    {
        m1=x;
        m2=y;
    }
    void show()
    {
        System.out.println("Student number: "+sno);
        System.out.println("Name is: "+name);
        System.out.println("Marks are "+m1+" and "+m2);
    }
}
class New
{
    public static void main(String[] args)
    {
        MethodsDemo md=new MethodsDemo();
        
        md.sno=520;
        md.name="surendra";
        //md.m1=90;
        //md.m2=95;
        md.getMarks(90, 95);
        md.show();
    }
}
