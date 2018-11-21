
/**
 * Write a description of class Dog here.
 *
 * @author HGomez
 * @version 2018/11/19
 */
public class Dog
{
    private String typeOfDog;
    private String raceOfDog;
    private String gender;
    private int height;
    private int averageLife;
    
    public Dog()
    {
    typeOfDog = "unkown";
    raceOfDog = "unkown";
    gender = "unkown";
    height = 15;
    averageLife = 13;
    }
    
    public Dog(String newTypeOfDog, String newRaceOfDog, String newGender, int newHeight, int newAverageLife)
    {
    typeOfDog = newTypeOfDog;
    raceOfDog = newRaceOfDog;
    gender = newGender;
    height = newHeight;
    averageLife = newAverageLife;
    }
    
    public String getType()
    {
        return typeOfDog;
    }
    
    public void setType(String newType)
    {
        typeOfDog = newType;
    }
    
    public String getRace()
    {
        return raceOfDog;
    }
    
    public void setRace(String newRace)
    {
        raceOfDog = newRace;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public void setGender(String newGender)
    {
        gender = newGender;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }
    
    public int getAverageLife()
    {
        return averageLife;
    }
    
    public void setAverageLife(int newAverageLife)
    {
        averageLife = newAverageLife;
    }
    
    
}



