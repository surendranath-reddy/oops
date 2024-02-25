/* @Description
 * When data members and parameters are with same names 
 * then to differentiate the data members are preceded
 * by reserved word this.
 *
 * @author surendra
 */

public class ThisDemo 
{
    int sno;
    private int m1,m2;
    String name;
    
    void getMarks(int m1,int m2)
    {
        this.m1=m1;
        this.m2=m2;
    }
    void show()
    {
        System.out.println("Student number: "+sno);
        System.out.println("Name is: "+name);
        System.out.println("Marks are "+m1+" and "+m2);
    }
}
class New1
{
    public static void main(String[] args)
    {
        ThisDemo td=new ThisDemo();
        
        td.sno=520;
        td.name="surendra";
        //td.m1=90;
        //td.m2=95;
        td.getMarks(90, 95);
        td.show();
    }
}
