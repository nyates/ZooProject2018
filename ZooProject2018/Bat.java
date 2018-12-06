
/**
 * Write a description of class Bat here.
 *
 * @author (NYates)
 * @version (2018/12/5)
 */
public class Bat extends Animal implements Flying
{
    public Bat()
    {
        super("a bat");
    }
    
    public Bat(String newDescription)
    {
        super(newDescription);
    }
    
    public Bat(int newSize, String newGender, 
            int newLifespan, String newDescription)
    {
        super(newSize, newGender, newLifespan, newDescription);
    }
    
    
    @Override
    public String eat()
    {
        return "The bat eats mosquitoes and other insects.";
    }
    
    @Override
    public String makeSound()
    {
        return "The bat screeches.";
    }
    
    @Override
    public String habitat()
    {
        return "The bat hangs upside down in caves.";
    }

    @Override
    public String fly()
    {
        return "The bat flies in the dark using echolocation.";
    }
    
    @Override
    public int getFlyingSpeed()
    {
        return 99;
    }
}
