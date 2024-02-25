/* @Description
 * Multi level inheritance
 *
 * @author surendra
 */

class Person1
{
    int pno;
    public String name;
    void showPerson()
    {
        System.out.println("Person number: "+pno);
        System.out.println("Name is: "+name);
    }  
}

class Student4 extends Person1
{
     int m1,m2;
    
    void showStudent()
    {
        System.out.println("Student marks are: "+m1+" and "+m2);
    }
}

class Result extends Student4
{
    int tot;
    void showResult()
    {
        tot=m1+m2;
        System.out.println("Total is: "+tot);
    }
}

public class InheritanceDemo1 
{
    public static void main(String[] args)
    {
        Result r=new Result();
        
        r.pno=520;
        r.name="Surendra";
        r.m1=90;
        r.m2=95;
        
        r.showPerson();
        r.showStudent();
        r.showResult();
    }
}
