
/**
 * Write a description of class SunBear here.
 *
 * @author (Avalon Mann)
 * @version (11/20/18)
 */
public class SunBear
{
   private String sound;
   private int size;
   private int weight;
   
   public SunBear()
   {
       sound = "unknown";
       size = 1;
       weight = 1;
   }
   public SunBear(String theSound, int theSize, int theWeight)
   {
       sound = theSound;
       size = theSize;
       weight = theWeight;
   }
   public String getSound()
   {
       return sound;
   }
   public int getSize()
   {
       return size;
   }
   public int getWeight()
   {
       return weight;
   }
   public void setSound(String newSound)
   {
       sound = newSound;
   }
   public void setSize(int newSize)
   {
       size = newSize;
   }
   public void setWeight(int newWeight)
   {
       weight = newWeight;
   }
   public String habitat()
   {
       return " The sun bear lives primarilly in southeast Asian tropical"
       +" forests.";
   }
   public String diet()
   {
       return "Omnivore: little birds, lizards, insects, fruit, and honey.";
   }
   public int lifespan()
   {
       return 25;
   }
}
