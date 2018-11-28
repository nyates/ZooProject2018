
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
        super("My head looks like a hammer");
        setType("hammerhead shark");
        speed = 25;
    }
    
    public HammerheadShark(String newDescription)
    {
        super(newDescription);
        setType("hammerhead shark");
        speed = 25;
    }
    
    public HammerheadShark(int newSize, String newGender, 
            int newLifespan, String newDescription,
            String newSound)
    {
        super(newSize, newGender, newLifespan, newDescription);
        setType("hammerhead shark");
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
