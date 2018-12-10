package ZooProject2018;


/**
 * Write a description of class Wolf here.
 *
 * @author Kumlachew)
 * @version 12/08/18
 */
public class Wolf extends Animal implements Hunting
{
    protected int size;
    protected String gender;
    protected int lifeSpan;
    protected String decription;
    
    public Wolf()
    {
        size = 0;
        gender = "unkown";
        lifeSpan = 0;
        decription = "a wild carnivorous mammal of the dog family, living and hunting in packs. It is native to both Eurasia and North America, but has been widely exterminated.";
    }
    public Wolf(String newDecription)
    {
        size = 0;
        gender = "unkown";
        lifeSpan = 0;
        decription = newDecription;
        
    }    
    public Wolf(int newSize, String newGender, int newLifeSpan, String newDecription)
    {
        size = newSize;
        gender = newGender;
        lifeSpan = newLifeSpan;
        decription = newDecription;        
        
    } 
    public int getSize()
    {
        return size;
    }
    public void setSize(int newSize)
    {
        size = newSize;
    }
    public String getGender()
    {
        return gender;
    }
    public void setGender(String newGender)
    {
        gender = newGender;
    }
    public int getLifeSpan()
    {
        return lifeSpan;
    }
    public void setLifeSpan(int newLifeSpan)
    {
        lifeSpan = newLifeSpan;
    }
    public String getDecription()
    {
        return decription;
    }
    public void setDecription(String newDecription)
    {
        decription = newDecription;
    }    
    public String fact()
    {
        return "Wolves have four toes on their hind feet and five toes on their fore feet.";
    }
    public String getScientificName()
    {
        return "Canis lupus";
    }
    public int getMass()
    {
        return 66;
    }
   @Override
   public String habitat()
   {
       return "The gray wolf lives today in a diverse range of environments, including tundra, mountain areas, woodlands, forests, grasslands and deserts. ";
   }
   @Override
   public String eat()
   {
        return  "Wolves predominately prey on hoofed animals including Deer, moose, Bison, Elk, and caribou.";
   }
   @Override
   public String makeSound()
   {
       return "lets hunt";
   } 
    @Override
    public String hunt()
    {
        return "Hunts for meat";
    }
    
    @Override
    public String prey()
    {
        return "deer";
    }   
}
