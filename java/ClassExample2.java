/*
 * class with static data members
 * Memory of static data members is commonly shared by
 * all objects of the class.
 *
 * @author surendra
 */

class Player
{
    String pname;
    int runs;
    static int total;
    
    void show()
    {
        System.out.println("Player Name: "+pname);
        System.out.println("Runs are: "+runs);
        total+=runs;
    }
    static void dispaly()
    {
        System.out.println("Total Runs are: "+total);
    }
}
public class ClassExample2 
{
    public static void main(String[] args)
    {
        Player p1=new Player();
        Player p2=new Player();
        
        p1.pname="Sachin";
        p1.runs=120;
        
        p2.pname="Dhoni";
        p2.runs=80;
        
        p1.show();
        p2.show();
        
        Player.dispaly();
        System.out.println("Total runs: "+Player.total);
    }
}
