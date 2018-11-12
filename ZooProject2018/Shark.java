
/**
 * Write a description of class Shark here.
 *
 * @author NYates
 * @version 2018/11/12
 */
public class Shark
{
    private String typeOfShark;
    private int length;
    private String gender;
    private String soundMade;
    
    public Shark()
    {
        typeOfShark = "unkown";
        length = 1;
        String gender = "unknown";
        String soundMade = "I'm going to eat you";
    }
    
    public Shark(String newTypeOfShark, int newLength, 
        String newGender, String newSound)
    {
        typeOfShark = newTypeOfShark;
        length = newLength;
        String gender = newGender;
        String soundMade = newSound;
    }
    
    public String getType()
    {
        return typeOfShark;
    }
    
    public void setType(String newType)
    {
        typeOfShark = newType;
    }
    
    // more getters and setters needed
    
    public String sleep()
    {
        return "Sharks sleep while swimming forward.";
    }
}
