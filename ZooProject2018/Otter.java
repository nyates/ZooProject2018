
/**
 * Write a description of class Otter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Otter
{
   private String sound;
   private int size;
   private int weight;
   
   public Otter()
   {
       sound = "unknown";
       size = 1;
       weight = 1;
   }
   public Otter(String theSound, int theSize, int theWeight)
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
       return "Otters can be found all over the world in almost any wet" 
       + "habitat: oceans, rivers, lakes, coatlines, and marshes.";
       
   }
   public String diet()
   {
       return "Carnivores: slow moving fish, frogs, eggs, crabs, sea urchin,"
       + "clams, mussels, etc.";
   }
   public int lifespan()
   {
       return 17;
   }
}
