
/**
 * Write a description of class Smordfish here.
 *
 * @author HGomez
 * @version 2018/11/21
 */
public class Swordfish
{
    private String gender;
    private double measure;
    private int averageLife; 
    private String food;
    
    public Swordfish()
    {
    gender = "unkown";
    measure = 1.8;
    averageLife = 10;
    food = "unkown";
    }
    
    public Swordfish(String newGender, double newMeasure, int newAverageLife, String newFood)
    {
    gender = newGender;
    measure = newMeasure;
    averageLife = newAverageLife;
    food = newFood;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public void setGender(String newGender)
    {
        gender = newGender;
    }
    
    public double getMeasure()
    {
        return measure;
    }
    
    public void setMeasure(double newMeasure)
    {
        measure = newMeasure;
    }
    
    public int getAverageLife()
    {
        return averageLife;
    }
    
    public void setAverageLife(int newAverageLife)
    {
        averageLife = newAverageLife;
    }
    
    public String getFood()
    {
        return food;
    }
    
    public void setFood(String newFood)
    {
        food = newFood;
    }
    
    
    
    
    public String eat()
    {
        return "Pelagic fish such as tuna, barracuda, flying fish, mackerel";
    }
    
    public String howManyYearsDoesASwordfishLive()
    {
        return "Have been reported to live up to 10 years, but in the Pacific Ocean longevity has been estimated at 12 years.";
    }
    
    public String howMuchDoesTheSwordfishMeasure()
    {
        return "Maximum length of about 4.5 m and a maximum weight of 650 kg.";
    }
    
    
    
    
    
    
}
