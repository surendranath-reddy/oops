/* @Description
 * Example on super: Method overriding
 *
 * @author surendra
 */
class Person2
{
    int pno;
    public String name;
    void show()
    {
        System.out.println("Person number: "+pno);
        System.out.println("Name is: "+name);
    }  
}

class Student5 extends Person2
{
    int m1,m2;
    
    void show()
    {
        super.show();
        System.out.println("Student marks are: "+m1+" and "+m2);
    }
}

class Result1 extends Student5
{
    int tot;
    void show()
    {
        super.show();
        tot=m1+m2;
        System.out.println("Total is: "+tot);
    }
}

public class InheritanceDemo2 
{
    public static void main(String[] args)
    {
        Result1 r=new Result1();
        
        r.pno=520;
        r.name="Surendra";
        r.m1=90;
        r.m2=95;
        
        r.show();
    }
}
