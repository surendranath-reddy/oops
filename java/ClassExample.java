/* @Description
 * Class with Data members and methods
 *
 * @author surendra
 */
public class ClassExample 
{
    int sno;
    public String name;
    public int m1,m2;
    
    public void show()
    {
        m1=90;
        m2=95;
        
        System.out.println("Student Number is: "+sno);
        System.out.println("Name is "+name);
        System.out.println("Marks are "+m1+" and "+m2);
        
    }
}
class ModifierEx
{
    public static void main(String[] args)
    {
        ClassExample s=new ClassExample();
        
        s.sno=520;
        s.name="Surendra";
        s.show();
    }
}
