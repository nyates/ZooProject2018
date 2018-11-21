
/**
 * Write a description of class Monkey here.
 *
 * @author HGomez
 * @version 2018/11/13
 */
public class Monkey
{
    private String typeOfMonkey;
    private int height;
    private String gender;
    private int averageLife;
    private double bodyMass;
    
    public Monkey()
    {
    typeOfMonkey = "unkown";
    height = 65;
    gender = "unkown";
    averageLife = 20;
    bodyMass = 3.9;
    }
    
    public Monkey(String newTypeOfMonkey, int newHeight, String newGender, int newAverageLife, double newBodyMass)
    {
    typeOfMonkey = newTypeOfMonkey;
    height = newHeight;
    gender = newGender;
    averageLife = newAverageLife;
    bodyMass = newBodyMass;
    }
    
    public String getType()
    {
        return typeOfMonkey;
    }
    
    public void setType(String newType)
    {
        typeOfMonkey = newType;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public void setGender(String newGender)
    {
        gender = newGender;
    }
    
    public int getAverageLife()
    {
        return averageLife;
    }
    
    public void setAverageLife(int newAverageLife)
    {
        averageLife = newAverageLife;
    }
    
    public double setBodyMass()
    {
        return bodyMass;
    }
    
    public void setBodyMass(double newBodyMass)
    {
        bodyMass = newBodyMass;
    }
    
    
    
    
    
    
    
}
