
/**
 * Write a description of class BengalTiger here.
 *
 * @author (Avalon Mann)
 * @version (11/20/18)
 */
public class BengalTiger extends Tiger
{
    int speed;
    public BengalTiger(int theSize, int theWeight, String theGender, String theCountry, int theAge)
    {
        super("roar", theSize, theWeight, theGender,  theCountry, theAge);
    }
    
    @Override
    public int lifespan()
    {
        return 15;
    }
    
    public void setSpeed(int newSpeed)
    {
        speed = newSpeed;
    }
}
