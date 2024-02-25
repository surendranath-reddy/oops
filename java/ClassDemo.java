/* @Description
 * Class and object Demo
 *
 * @author surendra
 */
public class ClassDemo 
{
    int sno,m1,m2,total;
    String name;
}
class ObjectDemo
{
    public static void main(String[] args)
    {
        ClassDemo cd=new ClassDemo();
        cd.sno=520;
        cd.name="Surendra";
        cd.m1=95;
        cd.m2=90;
        cd.total=cd.m1+cd.m2;
        
        System.out.println("Student number: "+cd.sno);
        System.out.println("Name is: "+cd.name);
        System.out.println("Marks are "+cd.m1+" and "+cd.m2);
        System.out.println("Marks total is: "+cd.total);
    }
}
