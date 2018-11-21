
/**
 * Write a description of class Otter here.
 *
 * @author (Avalon Mann)
 * @version (11/19/20)
 */
public class Otter
{
   private String sound;
   private int size;
   private int weight;
   private String gender;
   private String country;
   private int age;
   public Otter()
   {
       sound = "unknown";
       size = 1;
       weight = 1;
       gender = "unknown";
       country = "unknown";
       age = 0;
   }
   public Otter(String theSound, int theSize, int theWeight, String theGender, String theCountry, int theAge)
   {
       sound = theSound;
       size = theSize;
       weight = theWeight;
       gender = theGender;
       country = theCountry;
       age = theAge;
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
   public String getGender()
   {
       return gender;
   }
   public String getCountry()
   {
       return country;
   }
   public int getAge()
   {
       return age;
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
   public void setGender(String newGender)
   {
       gender = newGender;
   }
   public void setCountry(String newCountry)
   {
       country = newCountry;
   }
   public void setAge(int newAge)
   {
       age = newAge;
   }
   public String habitat()
   {
       return "Otters can be found all over the world in almost any wet" 
       + "habitat: oceans, rivers, lakes, coatlines, and marshes.";
       
   }
   public String diet()
   {
       return "They are carnivores. They eat things like slow moving fish, frogs, eggs, crabs, sea urchin,"
       + "clams, mussels, etc.";
   }
   public int lifespan()
   {
       return 17;
   }
}
