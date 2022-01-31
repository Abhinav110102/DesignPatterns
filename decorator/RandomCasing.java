package decorator;
import java.util.Random;
/** 
 * @author Abhinav
 * RandomCasing implements Password decorator class.
*/
public class RandomCasing extends PasswordDecorator {
/**
 * we create this.passwordBeginning equal it to passwordBeginning
 * We then set Password equal passwordBeginning.getpassword();
 * password equals passwordBeginning.getPassword() for RadomCasing
 * @param RandomCasing set passwordBeginning as the name
 */
    public RandomCasing(Password passwordBeginning)
    { super(passwordBeginning);
      this.passwordBeginning = passwordBeginning;
      password = passwordBeginning.getPassword();
    }
/** We create method that turn characters into Uppercase or Lowercase
 * @return We return password character that will have 50% chance of either being a Uppercase or Lowercase character
 */
    public String getPassword(){
        Random chance = new Random();
        for(int j =0; j< password.length();j++)
        {
            if(Character.isDigit(password.charAt(j)) == false)
            {
                if(chance.nextInt(10) < 5)
                {
                    password =password.substring(0,j-1)+ password.substring(j-1,j+1).toUpperCase()+password.substring(j+1,password.length());
                }
                else
                {
                    password = password.substring(0,j-1)+ password.substring(j-1,j+1).toLowerCase() + password.substring(j+1,password.length());
                }
            }
        }
        return password;
    }
}
