
/**
 * Write a description of class GermanShephers here.
 *
 * @author HGomez
 * @version 2018/11/26
 */
public class GermanShephers extends Dog
{
    private int speed;
    
    public GermanShephers()
    {
        super("GermanShephers", "unkown", 15, 13);
        speed = 0;
    }
    
    public GermanShephers(String newTypeOfDog, String newGender, int newHeight, int newAverageLife)
    {
        super();
        speed = 30;
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
        return "The GermanShephers eats beef, bison, and chicken, as well as fruits and vegetables.";
    }
    
    public String attack()
    {
        return "Train them poorly and encourage dogs to bite any intruders.";
    }
}
