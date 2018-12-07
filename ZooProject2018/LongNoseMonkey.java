
/**
 * Write a description of class LongNoseMonkey here.
 *
 * @author (Avalon Mann)
 * @version (11/26/2018)
 */
public class LongNoseMonkey extends Monkey
{
    String description;
    public LongNoseMonkey(int newHeight, String newGender, int newAverageLife)
    {
        super("Proboscis Monkey, aka the long nosed monkey", newHeight, newGender, newAverageLife, 100);
    }
    
    public String setDescription(String newDescription)
    {
        return "Massive nose. Look it up. It's the inspiration for Squidward. I swear to god. No, no, this nose is worse.";
    }
}
