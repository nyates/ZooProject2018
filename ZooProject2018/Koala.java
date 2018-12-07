
/**
 * Write a description of class Koala here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Koala extends Animal
{
    private int size;
   private int weight;
   private String gender;
   private String country;
   private int age;
   private String sound;
   public Koala()
   {
       sound = "unknown";
       size = 1;
       weight = 1;
       gender = "unknown";
       country = "unknown";
       age = 0;
   }
   public Koala(String theSound, int theSize, int theWeight, String theGender, String theCountry, int theAge)
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
       return "koala";
   }
   @Override
   public String habitat()
   {
       return "Koalas are native to eastern Australia.";
   }
   @Override
   public String eat()
   {
       return "They are herbivores. They eat mainly eucalyptus leaves, and an adult koala eats between 200 t 500 grams of leaves per day.";
   }
   public int lifespan()
   {
       return 17;
   }
   public String description()
   {
       return "Koalas appear cute and adorable, but they live in AUSTRALIA. Land of spiders as big as your hand and where 2-3 months out of the year magpies will randomly swoop down and try"+
       "To attack you. They live in the place Mother Nature calls 'The Reject Pile'. And the koala has survived. They are dangerous.";
   }
   @Override
   public String makeSound()
   {
       return "The koala bellows- wow that is loud for a tiny little thing.";
   }
}
