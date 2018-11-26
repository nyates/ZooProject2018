
/**
 * Write a description of class Husky here.
 *
 * @author (kumlachew)
 * @version (11/20/19)
 */
public class Husky extends Dog
{
    private int speed;
    private String temperament;
    private String color;
    private double height;
    
    public Husky()
    {
        speed = 0;
        temperament = "uknown";
        color = "uknown";
        height = 0.0;
    }
    public Husky(int theSpeed, String theTemperament, String theColor, int theHeight)
    {
        speed = theSpeed;
        temperament = theTemperament;
        color = theColor;
        height = theHeight;        
        
    }
    public int getSpeed()
    {
        return speed;
    }
    public void setSpeed(int newSpeed)
    {
        speed = newSpeed;
    }
    public String getTemperament()
    {
        return temperament;
    }
    public void setTemperament(String newTemperament)
    {
        temperament = newTemperament;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String newColor)
    {
        color = newColor;
    }
    public String getUnique()
    {
        return "Huskies are born to run, A group saved a small town in Alaska, They're not great watchdogs, Huskies don't get fatigued";
    }
    
    
    
    

}
