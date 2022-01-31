package decorator;
import java.util.Random;
/** 
 * @author Abhinav
 * SpecialChars  implements Password decorator class.
*/
public class SpecialChars extends PasswordDecorator
{
/**
 * we create this.passwordBeginning equal it to passwordBeginning
 * We then set Password equal passwordBeginning.getpassword();
 * password equals passwordBeginning.getPassword() for SpecialChars
 * @param SpecialChars set passwordBeginning as the name
 */
    public SpecialChars(Password passwordBeginning)
    {   
        super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
        password = passwordBeginning.getPassword();
    }
/** We create method that add random special characters to the password
 * @return We return password character that will have 30% chance of adding a special charater after a letter in the password 
 */
    public String getPassword()
    {
        Random chance = new Random();
        Random type = new Random();
     for(int s=0;s < password.length();s++)
        {
            if(chance.nextInt(10) < 3)
            {
                int symbol = type.nextInt(7);
                if(symbol == 0)
                {
                    password = password.substring(0,s)+ "%"+ password.substring(s,password.length());
                }
                else if(symbol == 1)
                {
                    password = password.substring(0,s)+ "*"+ password.substring(s,password.length());
                }
                else if(symbol == 2)
                {
                    password = password.substring(0,s)+ "+"+ password.substring(s,password.length());
                }
                else if(symbol == 3)
                {
                    password = password.substring(0,s)+ "!"+ password.substring(s,password.length());
                }
                else if(symbol == 4)
                {
                    password = password.substring(0,s)+ "{"+ password.substring(s,password.length());
                }
                else if(symbol == 5)
                {
                    password = password.substring(0,s)+ "."+ password.substring(s,password.length());
                }
                else
                {
                    password = password.substring(0,s)+ "}"+ password.substring(s,password.length());
                }
            }
        }
        return password;
    }
}
