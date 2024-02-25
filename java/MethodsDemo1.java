/* @Description
 * Methods with return statement
 *
 * @author surendra
 */

public class MethodsDemo1 
{
    int sno;
    int m1,m2;
    String name;
    
    int getTotal()
    {
        return(m1+m2);
    }
    void show()
    {
        System.out.println("Student number: "+sno);
        System.out.println("Name is: "+name);
        System.out.println("Marks are "+m1+" and "+m2);
    }
}
class New2
{
    public static void main(String[] args)
    {
        MethodsDemo1 md=new MethodsDemo1();
        
        md.sno=520;
        md.name="surendra";
        md.m1=90;
        md.m2=95;
        
        int tot=md.getTotal();
        md.show();
        System.out.println("Total is: "+tot);
    }
}
