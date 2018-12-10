
/**
 * Write a description of class Zebra here.
 *
 * @author HGomez
 * @version 2018-12-07
 */
public class Zebra
{
    private String typesOfZebra;
    private String gender;
    private int  populationLocation;
    private int weigh;
    
    public Zebra()
    {
    typesOfZebra = "unkown";
    gender = "unkown";
    populationLocation = 9;
    weigh = 400;
    }
    
    public Zebra(String newTypesOfZebra, String newGender, int newPopulationLocation, int newWeigh)
    {
    typesOfZebra = newTypesOfZebra;
    gender = newGender;
    populationLocation = newPopulationLocation;
    weigh = newWeigh;
    }
    
    public String getTypes()
    {
        return typesOfZebra;
    }
    
    public void setTypes(String newTypes)
    {
        typesOfZebra = newTypes;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public void setGender(String newGender)
    {
       gender = newGender; 
    }
    
    public int getPopulationLocation()
    {
        return populationLocation;
    }
    
    public void setPopulationLocation(int newPopulationLocation)
    {
        populationLocation = newPopulationLocation;
    }
    
    public int getWeigh()
    {
        return weigh;
    }
    
    public void setWeigh(int newWeigh)
    {
        weigh = newWeigh;
    }
    
    
    
    
    public String eat()
    {
        return "They feed on coarse grass, leaves and buds";
    }
    
    public String howManyZebraAreThereInTheWorld()
    {
        return "In general, the number of zebras plains is around 750,000.";
    }
    
    public String howManyLiveAZebra()
    {
        return "The life expectancy of the zebra is approximately 30 years.";
    }
}
