
/**
 * Write a description of class Ostrich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ostrich
{
    private String sound;
    private int speed;
    private int height;
    
    public Ostrich()
    {
        sound = "unkown";
        speed = 0;
        height = 0;
    }
    public Ostrich(String theSound, int theSpeed, int theHeight)
    {
        sound = theSound;
        speed = theSpeed;
        height = theHeight;
    }
    public String getSound()
    {
        return sound;
    }
    public int getSpeed()
    {
        return speed;
    }
    public int getHeight()
    {
        return height;
    }
    public void setSound(String newSound)
    {
        sound = newSound;   
    }
    public void setSpeed(int newSpeed)
    {
        speed = newSpeed;
    }
    public void setHeight(int newHeight)
    {
        height = newHeight; 
    }
    public String fact()
    {
        return "ostrich is the largest bird in the world";
    }
    public String famous()
    {
        return "Ostrich carries about 1 kilogram (2.2 lb) of stones in its stomach.";
    }
    public String whyImportant()
    {
        return "Today, ostrich farms are considered to be among the most profitable agricultural projects";
    }    

}
