/* @Description
 * Passing parameters to super class constructor.
 *
 * @author surendra
 */
class Info1
{
    private int a;
    
    Info1(int a)
    {
        this.a=a;
    }
    
    void show()
    {
       System.out.println("a= "+a);   
    }
}

class Tech1 extends Info1
{
    private int b;
    
    Tech1(int a,int b)
    {
      super(a);
      this.b=b;
    }
    
    void show()
    {
        super.show();
        System.out.println("b= "+b);
    }
}

public class InheritanceDemo5 
{
    public static void main(String[] args)
    {
        Tech1 t=new Tech1(5, 10);
        t.show();
    }
}
