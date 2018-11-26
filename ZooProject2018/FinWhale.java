
/**
 * Write a description of class FinWhale here.
 *
 * @author (Kumlachew hirgeto)
 * @version (11/26/2018)
 */
public class FinWhale extends BlueWhale
{
    private int massInLbs;
    //private int size;
    public FinWhale()
    {
        super("hello", 0, 0, "unkown");
        massInLbs = 0;
          
    }    
    public FinWhale(String theSound,int theSize, int theWeight, String theFact)
    {
        super(theSound, theSize, theWeight, theFact);
        massInLbs = 100000;
          
    }
    public int getMassInLbs()
    {
        return massInLbs;  
        
    }
    public void setSpeed(int newMass)
    {
        massInLbs = newMass;
    }
    @Override
    public int Live()
    {
        return 99;
    }
    public int lengthInFoot()
    {
        return 68;
        
    }
    
    
    

}
