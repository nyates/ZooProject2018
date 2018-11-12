
/**
 * Write a description of class Jaguar here.
 *
 * @author (kumlachew)
 * @version (11/12/2018)
 */
public class Jaguar
{
    private String color;
    private int length;
    private String sound;
    private String type;
    
    public Jaguar()
    {
        color = "unkown";
        length = 1;
        sound = "anger";
        type = "unkown";
    }
    public Jaguar(String newColor, int newLength, String newSound, String newType)
    {
        color = newColor;
        length = newLength;
        sound = newSound;
        type = newType;
    }
    public String getType()
    {
        return type; 
    }
    public void setType(String newType)
    {
        type = newType; 
    }
    //public String 
    

}
