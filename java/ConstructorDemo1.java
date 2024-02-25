/* @Description
 * Example on parameterized constructor: constructor overloading.
 *
 * @author surendra
 */
class Student1
{
    private int sno,total;
    private String name;
    
    //Deault constructor
    Student1()
    {
        sno=520;
        name="Surendra";
        total=600;
    }
    
    //Parameterized constructor
    
    Student1(int sno,  String name) {
        this.sno = sno;
        this.name = name;
        total=700;
    }
    
    //Parameterized constructor

    Student1(int sno, int total, String name) {
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

public class ConstructorDemo1 
{
    public static void main(String[] args)
    {
        Student1 s1=new Student1();
        Student1 s2=new Student1(521, "Suren");
        Student1 s3=new Student1(522, 800, "Suriya");
        
        s1.show();
        s2.show();
        s3.show();
                
    }
}
