/* @Description
 * Object as parameter to constructor
 *
 * @author surendra
 */

class Student2
{
    private int sno,total;
    private String name;
    
    //Object as Parameter

    public Student2(Student2 x) 
    {
        sno=x.sno;
        name=x.name;
        total=x.total;
    }
    
    //Parameterized constructor

    public Student2(int sno, int total, String name) 
    {
        this.sno = sno;
        this.total = total;
        this.name = name;
    }
    
     void show()
    {
        System.out.println("Student number is: "+sno);
        System.out.println("Name is: "+name);
        System.out.println("Total is: "+total);
    }     
}

public class ConstructorDemo2 
{
    public static void main(String[] args)
    {
        Student2 s1=new Student2(520, 700, "Surendra");
        Student2 s2=new Student2(s1);
        
        s1.show();
        s2.show();
    }
}
