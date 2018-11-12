
/**
 * Write a description of class Lion here.
 *
 * @author HGomez
 * @version 2018/11/12
 */
public class Lion
{
  private String typeOfLion;
  private int length;
  private String gender;
  private String soundMade;
  
  public Lion()
  {
  typeOfLion = "unkown";
  length = 1;
  gender = "unkown";
  soundMade = "I' m going to eat you";   
      
  }
  
  public Lion(String newTypeOfLion, int newLength, String newGender, String newSound)
  {
  typeOfLion = newTypeOfLion;
  length = newLength;
  gender = newGender;
  soundMade = newSound;  
  }
  
  public String getType()
  {
      return typeOfLion;
  }
  
  public void setType(String newType)
  {
      typeOfLion = newType;
  }
  
  //more getters and setters needed
  
  public String LookingForFood;
  {
      
  }
}
