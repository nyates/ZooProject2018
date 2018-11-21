
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
   private String gender;
   private String country;
   private int age;
   public SunBear()
   {
       sound = "unknown";
       size = 1;
       weight = 1;
       gender = "unknown";
       country = "unknown";
       age = 0;
   }
   public SunBear(String theSound, int theSize, int theWeight, String theGender, String theCountry, int theAge)
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
       return "The sun bear lives primarilly in southeast Asian tropical"
       +" forests.";
   }
   public String diet()
   {
       return "They are omnivores. They eat things like little birds, lizards, insects, fruit, and honey.";
   }
   public int lifespan()
   {
       return 25;
   }
}
