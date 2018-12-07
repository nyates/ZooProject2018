package ZooProject2018;
/**
 * Write a description of class Husky here.
 *
 * @author (kumlachew)
 * @version (11/20/19)
 */
public class Husky extends Dog
{
   

    private String personality;
    public Husky()
    {
      super("unkown","unkown","unkown",0,0);
      personality = "unkown";
    }
    public Husky(String theTypeOfDog, String theRaceOfDog, String theGender, int theHeight, int theAverageLife)
    {
      super(theTypeOfDog, theRaceOfDog, theGender, theHeight, theAverageLife);
      personality = "intelligent, outgoing, alert, friendly, and gentle";

    }
    public String getPersonality()
    {
      return personality;
    }
    public void setpPrsonality(String newPersonality)
    {
      personality = newPersonality;
    }
    // @Override
    //public int
    // herbert need to make 3 method so that i can Override it.

}
