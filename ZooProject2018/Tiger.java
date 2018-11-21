
/**
 * Write a description of class Tiger here.
 *
 * @author (Avalon Mann)
 * @version (11/19/18)
 */
public class Tiger
{
   private String sound;
   private int size;
   private int weight;
   private String gender;
   private String country;
   private int age;
   public Tiger()
   {
       sound = "unknown";
       size = 1;
       weight = 1;
       gender = "unknown";
       country = "unknown";
       age = 0;
   }
   public Tiger(String theSound, int theSize, int theWeight, String theGender, String theCountry, int theAge)
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
       return "Tigers can live in a variety of habitats, from tropical forests"
       + " to the rocky savannah.";
   }
   public String diet()
   {
       return "They are carnivores. They eat things like wild boar, watter bufffalo, sambar.";
   }
   public int lifespan()
   {
       return 17;
   }
}
