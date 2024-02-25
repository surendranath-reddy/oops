/* @Description
 * class with multiple methods
 *
 * @author surendra
 */

public class ClassExample1 
{
    int sno;
    public String name;
    public int m1,m2,total;
    
    public void show()
    {
        System.out.println("Student number: "+sno);
        System.out.println("Name is: "+name);
        System.out.println("Marks are "+m1+" and "+m2);
        System.out.println("Total is: "+total);
    }
    void totalCal()
    {
        total=m1+m2;
    }
}
class ModifierEx1
{
    public static void main(String[] args)
    {
        ClassExample1 cs=new ClassExample1();
        
        cs.sno=520;
        cs.name="surendra";
        cs.m1=90;
        cs.m2=95;
        cs.totalCal();
        cs.show();
    }
}
