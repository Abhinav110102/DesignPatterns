package strategy;
import java.util.ArrayList;
/** 
 * @author Abhinav
 * InsertionSort implements SortBehavior class and we also create a algorithm that sorts the items in the list through InsertionSort 
 * Sources I used for this for this algorithm: https://www.youtube.com/watch?v=4P95xpLjbQ4&t=306s This video talks about insertionSort with String ArrayList,
 * https://www.geeksforgeeks.org/insertion-sort/ and the video on the page , and https://www.java67.com/2014/09/insertion-sort-in-java-with-example.html this website explain and give multiple examples of how to do insertion sort in multiple cases. 
 */
public class InsertionSort implements SortBehavior {
    public ArrayList<String> sort(ArrayList<String> data){
        for(int i = 1; i< data.size();i++){
            String now = data.get(i);
            int index = i;
            while(index > 0 && now.compareTo(data.get(index-1)) < 0)
            {
                data.set(index,data.get(index-1));
                index--;
            }
            data.set(index, now);
        }
        return data;
    }
}






