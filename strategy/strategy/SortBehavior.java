package strategy;
import java.util.ArrayList;

/** 
 * @author Abhinav
 * Sort Behavior is interface which get implemented by BubbleSort and InsertionSort.
 */
public interface SortBehavior {
    public ArrayList<String> sort(ArrayList<String>data);
    
}
