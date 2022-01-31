package decorator;
/** 
 * @author Abhinav
 * Symbols implements Password decorator class.
*/
public class Symbols extends PasswordDecorator
{
/**
 * we create this.passwordBeginning equal it to passwordBeginning
 * We then set Password equal passwordBeginning.getpassword();
 * password equals passwordBeginning.getPassword() for Symbols
 * @param Symbols set passwordBeginning as the name
 */
    public Symbols(Password passwordBeginning)
    {   super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
        password = passwordBeginning.getPassword();
    }
/** We create method that replace certain letters into letters or numbers
 * @return We return password which will have replaced letters
 */
     public String getPassword()
    { 
      String replace = passwordBeginning.getPassword().replace("a", "@") .replace("b", "8").replace("e", "3").replace("g", "9").replace("i", "!").replace("o", "0").replace("s", "$").replace("t", "7");
        return replace;
    }
}
