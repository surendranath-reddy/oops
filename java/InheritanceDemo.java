/* @Description
 * Example on single level inheritance
 * @author surendra
 */

class Person
{
    int pno;
    public String name;
    void showPerson()
    {
        System.out.println("Person number: "+pno);
        System.out.println("Name is: "+name);
    }    
}

class Student3 extends Person
{
    int m1,m2;
    
    void showStudent()
    {
        System.out.println("Student marks are: "+m1+" and "+m2);
    }
}

public class InheritanceDemo 
{
    public static void main(String[] args)
    {
        Student3 s=new Student3();
        s.pno=520;
        s.name="Surendra";
        s.m1=90;
        s.m2=95;
        
        s.showPerson();
        s.showStudent();
    }
}
