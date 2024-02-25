
/**
 *
 * @author surendra
 */

class Thief
{
    int tamt;
    String tname;
    
    void showThief()
    {
        System.out.println("Thief name: "+tname);
        System.out.println("Theft amount: "+tamt);
        System.out.println("__________________________________");
    }
}
class Police
{
    int bamt=0;
    String pname;
    void Caught(Thief t)
    {
        bamt=t.tamt;
        t.tamt=0;
    }
    void showPolice()
    {
        System.out.println("Police name "+pname);
        System.out.println("Burgler recovery amount "+bamt);
        System.out.println("__________________________________");
    }
}
public class MessagePassing 
{
    public static void main(String[] args)
    {
        Thief t=new Thief();
        
        t.tname="Suren";
        t.tamt=2000;
        
        Police p=new Police();
        
        p.pname="Surendranath Reddy";
        
        t.showThief();
        p.showPolice();
        p.Caught(t);
        t.showThief();
        p.showPolice();
    }
}