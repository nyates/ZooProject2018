
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
  
  public Lion(String newTypeOfLion, int newLength, String newGender, String newSoundMade)
  {
  typeOfLion = newTypeOfLion;
  length = newLength;
  gender = newGender;
  soundMade = newSoundMade;  
  }
  
  public String getType()
  {
      return typeOfLion;
  }
  
  public void setType(String newType)
  {
      typeOfLion = newType;
  }
  
  public int getLength()
  {
      return length;
  }
  
  public void setLength(int newLength)
  {
      length = newLength;
  }
  
  public String getGender()
  {
      return gender;
  }
  
  public void setGender(String newGender)
  {
      gender = newGender;
  }
  
  public String getSoundMade()
  {
      return soundMade;
  }
  
  public void setSoundMade(String newSoundMade)
  {
      soundMade = newSoundMade;
  }
 
  
  
  
  public String LookingForFood()
  {
    return "the lions hunt their prey very carefully and then attack their prey when it is preventd.";
  }
}
