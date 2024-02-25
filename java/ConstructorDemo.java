/* @Description
 * Example on Default Constructor
 *
 * @author surendra
 */
class Student
{
    private int sno,total;
    private String name;
    
    //Deault constructor
    Student()
    {
        sno=520;
        name="Surendra";
        total=600;
    }
    void show()
    {
        System.out.println("Student number is: "+sno);
        System.out.println("Name is: "+name);
        System.out.println("Total is: "+total);
    }
}
public class ConstructorDemo 
{
    public static void main(String[] args)
    {
        Student s=new Student();
        
        //s.sno=520;
        //s.sname="surendra";
        //s.total=600;
        s.show();
    }
}
