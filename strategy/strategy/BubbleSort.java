package strategy;
import java.util.ArrayList;
/** 
 * @author Abhinav
 * BubbleSort implements SortBehavior class and we also create a algorithm that sorts the items in the list through BubbleSort 
 * Sources I used for this algorithm are : https://www.youtube.com/watch?v=uJLwnsLn0_Q a video about BubbleSort,
 * and https://www.geeksforgeeks.org/sorting-strings-using-bubble-sort-2/ this website help me understand the simple bubbleSort and remeber what we learned in CSCE 146, 
 * and https://javarevisited.blogspot.com/2014/08/bubble-sort-algorithm-in-java-with.html#axzz7IBhOKsRw This blog had multiple example in which bubble sort was used 
 */

public class BubbleSort implements SortBehavior {
    public ArrayList<String> sort(ArrayList<String> data)
    {
    String bubble;
    for(int i=0; i< data.size();i++)
    {
        for(int j=1+i; j < data.size();j++)
        {
            if(data.get(i).compareTo(data.get(j))>0) 
            {
            bubble = data.get(i);
            data.set(i,data.get(j));
            data.set(j,bubble);
            }
        }
    }
        return data;
    }
}
