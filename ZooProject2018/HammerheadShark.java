
/**
 * Write a description of class HammerheadShark here.
 *
 * @author (NYates)
 * @version (2018/11/26)
 */
public class HammerheadShark extends Shark
{
    private int speed;
    
    public HammerheadShark()
    {
        super("Hammerhead Shark", 1, 
            "unknown", "My head is a hammer");
        speed = 0;
    }
    
    public HammerheadShark(int newLength, String newGender)
    {
        super("Hammerhead Shark", newLength, 
            newGender, "My head is a hammer");
        speed = 25;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public void setSpeed(int newSpeed)
    {
        speed = newSpeed;
    }
    
    @Override
    public String eat()
    {
        return "The hammerhead shark eats fish," +  
            "squid, octopodes, and crustaceans.";
    }
    
    public String attack()
    {
        return "The hammerhead shark attacks the nail with its hammer.";
    }
}
