
/**
 * Write a description of class Reptile here.
 *
 * @author (kumlacherw)
 * @version (11/19/2018)
 */
import java.util.Random;
public class KomodoDragon
{
    private int speed;
    private String conservationStatus;
    private String scientificnName;
    private int mass;
    private int length;
    
    public KomodoDragon()
    {
            speed = 0;
            conservationStatus = "unkown";
            scientificnName = "unkown";
            mass = 0;
            length = 0;
    }
    public KomodoDragon(String theConservationStatus, int theSpeed, String theScientificnName, int theMass, int theLength) 
    {
            speed = theSpeed;
            conservationStatus = theConservationStatus;
            scientificnName = theScientificnName;
            mass = theMass;
            length = theLength;
    }
    public int getSpeed()
    {
            return speed; 
    }
    public void setSpeed(int newSpeed)
    {
        speed = newSpeed;
    }
    public String getConservationStatus()
    {
            return conservationStatus; 
    }
    public void setConservationStatus(String newConservationStatus)
    {
         conservationStatus = newConservationStatus;
    }
    public String getScientificnName()
    {
            return scientificnName; 
    }
    public void setScientificnName(String newScientificnName)
    {
         scientificnName = newScientificnName;
    }
    public int getMass()
    {
            return mass; 
    }
    public void setMass(int newMass)
    {
        mass = newMass;
    
    }
    public int getLength()
    {
        return length; 
    }
    public void setLength(int newLength)
    {
        length = newLength;
    }
    
    public String getFact()
    {
            String[] arr={"Komodo dragons are carnivores, meaning they eat meat.","They are such fierce hunters they can eat \n very large prey, such as large water buffalo, deer, carrion, pigs and even humans.","They will also eat smaller\n dragons.", "They can eat 80 percent of their body weight \n in one feeding, according to the National Geographic","Komodo dragons can reproduce both sexually and asexually."};
            Random fact = new Random();
            int randomNumber = fact. nextInt(arr.length);
            return (arr[randomNumber]);
        
        
    }
              
        
        

}
