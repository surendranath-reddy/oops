/* @Description
 * Example on chaining of methods (Method calling another method)
 *
 * @author surendra
 */

public class PrivateMethodsDemo 
{
    int sno;
    public String name;
    int m1,m2,total,avg;
    
    public void show()
    {
        totalCal();
        System.out.println("Student number: "+sno);
        System.out.println("Name is: "+name);
        System.out.println("Marks are "+m1+" and "+m2);
        System.out.println("Total is: "+total);
        System.out.println("Average is: "+avg);
    }
    
    private void totalCal()
    {
        total=m1+m2;
        avgCal();
    }
    private void avgCal()
    {
        avg=total/2;
    }
}

class ModifierEx2
{
    public static void main(String[] args)
    {
        PrivateMethodsDemo pm=new PrivateMethodsDemo();
        
        ClassExample1 cs=new ClassExample1();
        
        pm.sno=520;
        pm.name="surendra";
        pm.m1=90;
        pm.m2=95;
        // Private methods cannot be accessed from another class
        //pm.totalCal();
        //pm.avgCal();
        pm.show();
    }
}
