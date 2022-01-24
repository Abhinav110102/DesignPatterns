package observer;
import java.util.HashMap;
/** 
 * Observer is interface which get implemented by PercentageDisplay and TallyDisplay.
 * @author Abhinav
 **/
public interface Observer {
    public void update(HashMap <String,Integer> votes);
    
}
