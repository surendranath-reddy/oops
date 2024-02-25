/* @Description
 * Example on hierarchial inheritance
 *
 * @author surendra
 */
class Person3
{
    int pno;
    public String name;
    void show()
    {
        System.out.println("Person number: "+pno);
        System.out.println("Name is: "+name);
    }  
}

class Student6 extends Person3
{
     int m1,m2;
    
    void show()
    {
        super.show();
        System.out.println("Student marks are: "+m1+" and "+m2);
    }
}

class Employee1 extends Person3
{
    int sal;
    void show()
    {
        super.show();
        System.out.println("Salary is: "+sal);
    }
}
public class InheritanceDemo3 
{
    public static void main(String[] args)
    {
        Student6 s=new Student6();
        
        s.pno=520;
        s.name="Surendra";
        s.m1=90;
        s.m2=95;
        
        s.show();
        
        Employee1 e=new Employee1();
        
        e.pno=521;
        e.name="Sri";
        e.sal=50000;
        
        e.show();
                
    }
}
