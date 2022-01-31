package decorator;
/** 
 * @author Abhinav
 * Password decorator is a abstract class and is implemented by Password class.
*/
public abstract class PasswordDecorator extends Password {
   protected Password passwordBeginning;
/**
 * We create Protected Password passwordBeginning
 * We create this.passwordBeginning equal it to passwordBeginning
 * @param PasswordDecorator set passwordBeginning as the name
 */
    public PasswordDecorator(Password passwordBeginning)
    {
        this.passwordBeginning = passwordBeginning;
    }
/**
 * we create public abstract String getPassword
 */
    public abstract String getPassword();

    
}
