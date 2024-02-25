/* @Description
 * Polymorphism(runtime) or dynamic method dispatch
 * Runtime polymorphism can be attained in 3 ways
 * 1. Super class object referencong to sub class
 * 2. Using abstract classes
 * 3. Using interfaces
 *
 * @author surendra
 */
class Data
{
    int a,b;
    void cal()
    {
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}

class Poly extends Data
{
    void cal()
    {
        System.out.println("sum is "+(a+b));
    }
}

class Morp extends Data
{
    void cal()
    {
        System.out.println("product is "+(a*b));
    }
}

public class PolymorphismDemo 
{
    public static void main(String[] args)
    {
        Data d;
        
        Poly i=new Poly();
        
        Morp t=new Morp();
        
        i.a=5;
        i.b=10;
        
        t.a=7;
        t.b=3;
        
        d=i;
        d.cal();
        
        d=t;
        d.cal();
    }
}
