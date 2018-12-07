
/**
 * Write a description of class Shark here.
 *
 * @author NYates
 * @version 2018/11/12
 */
public class Shark extends Animal
{
    private String typeOfShark;
    private String soundMade;
         
    public Shark()
    {
        super();
        typeOfShark = "unkown";
        soundMade = "I'm going to eat you";
    }
    
    public Shark(String newDescription)
    {
        super(newDescription);
        typeOfShark = "unkown";
        soundMade = "I'm going to eat you";
    }
    
    public Shark(int newSize, String newGender, 
            int newLifespan, String newDescription)
    {
        super(newSize, newGender, newLifespan, newDescription);
        typeOfShark = "unkown";
        soundMade = "I'm going to eat you";
    }
    
    public Shark(int newSize, String newGender, 
            int newLifespan, String newDescription,
            String newTypeOfShark, String newSound)
    {
        super(newSize, newGender, newLifespan, newDescription);
        typeOfShark = newTypeOfShark;
        soundMade = newSound;
    }
    
    public String getType()
    {
        return typeOfShark;
    }
    
    public void setType(String newType)
    {
        typeOfShark = newType;
    }
    
    public String getSound()
    {
        return soundMade;
    }
    
    public void setSound(String newSound)
    {
        soundMade = newSound;
    }
    
    public String sleep()
    {
        return "Sharks sleep while swimming forward.";
    }
    
    @Override
    public String eat()
    {
        return "The shark devours anything it can catch";
    }
    
    @Override
    public String makeSound()
    {
        return "The shark says: " + getSound();
    }
    
    @Override
    public String habitat()
    {
        return "The shark swims and lives in the ocean.";
    }
}
