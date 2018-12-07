
/**
 * Write a description of class Flamingo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flamingo extends Animal
{
    private int size;
   private int weight;
   private String gender;
   private String country;
   private int age;
   private String sound;
   public Flamingo()
   {
       sound = "unknown";
       size = 1;
       weight = 1;
       gender = "unknown";
       country = "unknown";
       age = 0;
   }
   public Flamingo(String theSound, int theSize, int theWeight, String theGender, String theCountry, int theAge, String theAnimal)
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
   public String species()
   {
       return "flamingo";
   }
   @Override
   public String habitat()
   {
       return "Flamingos live near shallow bodies of water.";
   }
   @Override
   public String eat()
   {
       return "They are carnivores. They eat things like wild boar, watter bufffalo, sambar.";
   }
   public int lifespan()
   {
       return 30;
   }
   public String description()
   {
       return "Flamingos appear nice until you really look at them. Those legs. That neck. Why, evoloution, why.";
   }
   @Override
   public String makeSound()
   {
       return "The flamingo lets out a squawk. Honestly, it's kind of funny.";
   }
}
