
/**
 * Write a description of class BlueWhale here.
 *
 * @author (kumlachew)
 * @version (11/13/2018)
 */
public class BlueWhale
{
    // instance variables - replace the example below with your own
    private String sound;
    private int size;
    private int weight;
    
    public BlueWhale()
    {
        sound = "uknown";
        size = 1;
        weight = 1;
    }
    public BlueWhale(String theSound, int theSize, int theWeight)
    {
        sound = theSound;
        size = theSize;
        weight = theWeight;       
    }
    public String getSound()
    {
        return sound;
    }
    public int getSize()
    {
        return size;
    }
    public int getWeight()
    {
        return weight;
    } 
    public void setSound(String newSound)
    {
        sound = newSound; 
    } 
    public void setSize(int newSize)
    {
        size = newSize; 
    }
    public void setWeight(int newWeight)
    {
        weight = newWeight; 
    } 
    public String habitat()
    {
        return "The blue whale is an oceanic animal, preferring deep waters in the middle of the ocean to coastal waters.";
    }
    public String diet()
    {
        String sec = "A blue whale can eat up to 8,000 lbs. of krill during its peak consumption period.";
        return "Blue whales filter their food through their baleen plates. Blue whales eat krill (euphausiids) and copepods. "+sec;
        
    }
    public int live()
    {
        return 95;        
    }
    
    

}
