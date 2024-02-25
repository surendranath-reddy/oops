/* @Description
 * Array of Objects
 *
 * @author surendra
 */

class ClassDemo3 
{
    int sno,m1,m2,total;
    String name;
}

public class ObjectExample2 
{
    public static void main(String[] args)
    {
        ClassDemo3 cd[]=new ClassDemo3[2];
        
        cd[0]=new ClassDemo3();
        cd[1]=new ClassDemo3();
        
        cd[0].sno=520;
        cd[0].name="Surendra";
        cd[0].m1=95;
        cd[0].m2=90;
        cd[0].total=cd[0].m1+cd[0].m2;
        
        cd[1].sno=537;
        cd[1].name="Raju";
        cd[1].m1=50;
        cd[1].m2=80;
        cd[1].total=cd[1].m1+cd[1].m2;
        
        System.out.println("Student number: "+cd[0].sno);
        System.out.println("Name is: "+cd[0].name);
        System.out.println("Marks are "+cd[0].m1+" and "+cd[0].m2);
        System.out.println("Marks total is: "+cd[0].total);
        
        System.out.println("______________________");
        System.out.println("Student number: "+cd[1].sno);
        System.out.println("Name is: "+cd[1].name);
        System.out.println("Marks are "+cd[1].m1+" and "+cd[1].m2);
        System.out.println("Marks total is: "+cd[1].total);
    }
}
