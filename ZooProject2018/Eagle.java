
/**
 * Write a description of class Eagle here.
 *
 * @author (kumlachew)
 * @version (11/20/18)
 */
import java.util.Random;
public class Eagle
{
    private String special;
    private int wingSpan;
    private int lifeSpan;
    private int altitude;
    private String fact;
    
    public Eagle()
    {
        special = "unkown";
        wingSpan = 0;
        lifeSpan = 0;
        altitude = 0;
        fact = "unkown";

    }
    public Eagle(String theSpecial, int theWingSpan, int theLifeSpan, int theAltitude, String theFact) 
    {
        special = theSpecial;
        wingSpan = theWingSpan;
        lifeSpan = theLifeSpan;
        altitude = theAltitude;
        fact = theFact;       

    }
    public String getSpecial()
    {
        return special;
    }
    public void setSpecial(String newSpecial)
    {
        special = newSpecial;
        
    }
    public int getWingSpan()
    {
        return wingSpan;
    }
    public void setWingSpan(int newWingSpan)
    {
        wingSpan = newWingSpan;
        
    }
    public int getLifeSpan()
    {
        return lifeSpan;
    }
    public void setLifeSpan(int newLifeSpan)
    {
        lifeSpan = newLifeSpan;
        
    }
    public int getAltitude()
    {
        return altitude;
    }
    public void setAltitude(int newAltitude)
    {
        altitude = newAltitude;
        
    }   
    public String get()
    {
        String[] arr={"Komodo dragons are carnivores, meaning they eat meat.","They are such fierce hunters they can eat \n very large prey, such as large water buffalo, deer, carrion, pigs and even humans.","They will also eat smaller\n dragons.", "They can eat 80 percent of their body weight \n in one feeding, according to the National Geographic","Komodo dragons can reproduce both sexually and asexually."};
        Random fact = new Random();
        int randomNumber = fact. nextInt(arr.length);
        return (arr[randomNumber]);
    
    
    }
    public void setFact(String newFact)
    {
        fact = newFact;
        
    }        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
