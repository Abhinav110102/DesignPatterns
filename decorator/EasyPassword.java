package decorator;
import java.util.Random;
/** 
 * @author Abhinav
 * EasyPassword implements Password.
*/
public class EasyPassword extends Password {
/** 
 * @param we set this.password equals phrase 
 */
    public EasyPassword(String Phrase)
    {
        this.password = Phrase;
    }
/** 
 * @return we return a password and number between 0-100 
 */
    public String getPassword() 
    {
        String pas = password.replaceAll("\\s","");
        int high = 100;
        int low = 1;
        Random randomNum = new Random();
        int rannum = low + randomNum.nextInt(high);
		return pas+rannum;
	}
	
}
