
/**
 * Write a description of class BlackPather here.
 *
 * @author HGomez
 * @version 2018/11/26
 */
public class BlackPather extends Jaguar
{
    private int speed;
    
    public BlackPather()
    {
        super("unkown", 1, "anger", "unkown");
    }
    
    public BlackPather(String newColor, int newLength, String newSound, String newType)
    {
        super();
        speed = 65;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public void setSpeed(int newSpeed)
    {
        speed = newSpeed;
    }
    
    public String eat()
    {
        return "Deer, wild boar, wild boar, tapir and antelopes";
    }
    
    
    
    
}
