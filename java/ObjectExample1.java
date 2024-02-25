/* @Description
 * Class with Multiple objects
 *
 * @author surendra
 */

class ClassDemo2 
{
    int sno,m1,m2,total;
    String name;
}

public class ObjectExample1 
{
    public static void main(String[] args)
    {
        ClassDemo2 cd=new ClassDemo2();
        ClassDemo2 cd1=new ClassDemo2();
        
       cd.sno=520;
       cd.name="Surendra";
       cd.m1=95;
       cd.m2=90;
       cd.total=cd.m1+cd.m2;
       
       cd1.sno=537;
       cd1.name="Raju";
       cd1.m1=50;
       cd1.m2=80;
       cd1.total=cd1.m1+cd1.m2;
       
       System.out.println("Student number: "+cd.sno);
       System.out.println("Name is: "+cd.name);
       System.out.println("Marks are "+cd.m1+" and "+cd.m2);
       System.out.println("Marks total is: "+cd.total);
       
       System.out.println("________________________");
       
       System.out.println("Student number: "+cd1.sno);
       System.out.println("Name is: "+cd1.name);
       System.out.println("Marks are "+cd1.m1+" and "+cd1.m2);
       System.out.println("Marks total is: "+cd1.total);
    }
}
