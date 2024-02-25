/* @Description
 * Class within class is called inner class.
 * These classes are also called as nested classes.
 * The data members of outer class can be used in inner class but the data
 * members of inner class cannot be usedd in outer class.
 * Inorder to make use of the data members of inner class in other class,
 * the object of inner class should be created in outer class and through that
 * object the data members of inner class can be used.
 *
 * @author surendra
 */

class Employee
{
    String ename="Surendra";
    int pay=50000;
    
    class Address
    {
        String street="prasanthnagar";
        int pin=523357;
        
        void showAddr()
        {
            System.out.println("Name is: "+ename);
            System.out.println("Pay is: "+pay);
            System.out.println("Street is: "+street);
            System.out.println("Pincode is: "+pin);
        }
    }
    
    void showEmp()
    {
        System.out.println("Employee name: "+ename);
        System.out.println("pay is: "+pay);
        
        Address a=new Address();
        a.showAddr();
    }
}
public class InnerClassDemo 
{
    public static void main(String[] args)
    {
        Employee e=new Employee();
        e.showEmp();
    }
}
