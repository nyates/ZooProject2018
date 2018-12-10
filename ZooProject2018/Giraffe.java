
/**
 * Write a description of class Giraffe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Giraffe
{
    private String typesOfGiraffes;
    private String gender;
    private int height;
    private int weight;
    
    public Giraffe()
    {
    typesOfGiraffes = "unkown";
    gender = "unkown";
    height = 6;
    weight = 1192;
    }
    
    public Giraffe(String newTypesOfGiraffes, String newGender, int newHeight, int newWeight)
    {
    typesOfGiraffes = newTypesOfGiraffes;
    gender = newGender;
    height = newHeight;
    weight = newWeight;
    }
    
    public String getTypes()
    {
        return typesOfGiraffes;
    }
    
    public void setTypes(String newTypes)
    {
        typesOfGiraffes = newTypes;
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
    
    public int getWeight()
    {
        return weight;
    }
    
    public void setWeight(int newWeight)
    {
        weight = newWeight;
    }
    
    
    
    
    public String eat()
    {
        return "They feed mainly on acacia trees and Commiphora (myrrh).";
    }
    
    public String howMuchDecreasedTheGiraffePopulation()
    {
        return "The world population of giraffes has decreased by almost 40% in just 30 years.";
    }
    
    public String howManyYearsHeLives()
    {
        return "Both male and female can live up to about 25 years.";
    }
}
