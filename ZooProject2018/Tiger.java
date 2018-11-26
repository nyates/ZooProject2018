
/**
 * Write a description of class Tiger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tiger
{
   private String sound;
   private int size;
   private int weight;
   
   public Tiger()
   {
       sound = "unknown";
       size = 1;
       weight = 1;
   }
   public Tiger(String theSound, int theSize, int theWeight)
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
       return "Tigers can live in a variety of habitats, from tropical forests"
       + " to the rocky savannah.";
   }
   public String diet()
   {
       return "Carnivore: wild boar, watter bufffalo, sambar.";
   }
   public int lifespan()
   {
       return 17;
   }
}
