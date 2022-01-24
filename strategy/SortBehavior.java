package strategy;
import java.util.ArrayList;

/** 
 * Sort Behavior is interface which get implemented by BubbleSort and InsertionSort.
 * @author Abhinav
 */
public interface SortBehavior {
    public ArrayList<String> sort(ArrayList<String>data);
    
}
