/* @Description
 * Object referencing another Object
 *
 * @author surendra
 */
class ClassDemo1 
{
    int sno,m1,m2,total;
    String name;
}
public class ObjectExample 
{
    public static void main(String[] args)
    {
       ClassDemo1 cd=new ClassDemo1();
       ClassDemo1 cd1;
       cd.sno=520;
       cd.name="Surendra";
       cd.m1=95;
       cd.m2=90;
       cd.total=cd.m1+cd.m2;
       
       cd1=cd;
       
       System.out.println("Student number: "+cd1.sno);
       System.out.println("Name is: "+cd1.name);
       System.out.println("Marks are "+cd1.m1+" and "+cd1.m2);
       System.out.println("Marks total is: "+cd1.total);
    }
}
