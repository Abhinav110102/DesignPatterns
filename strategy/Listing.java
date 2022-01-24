package strategy;
import java.util.ArrayList;
/** 
 * @author Abhinav
 *We create a string called title
 * we create private Arraylist<string> and set name as items
 * we create private SortBehavior and set it as sortBehavior
*/
public class Listing {
private String title;
private ArrayList<String> items;
private SortBehavior sortBehavior;
/** 
 * we create this.title equal it to title
 * we set items equal to new arraylist<string> 
 * we set the sortbehavior default to bubblesort
*/
public Listing(String title){
    this.title = title;
    items = new ArrayList<String>();
    sortBehavior = new BubbleSort();
}
/** 
 * @param add the items to the list
*/
public void add(String item){ 
   items.add(item); }
/**  
 * @param we remove the items form the list
*/
public void remove(String item){
    items.remove(item);
}
/** 
 * We get name of the product 
 * @return  We return the title of the products
*/
public String getTitle(){
    return title; }
/** 
 * @param we set the SortBehavior to sortbehavior 
 */
public void setSortBehavior(SortBehavior sortBehavior)
{
    this.sortBehavior = sortBehavior;
}
/** 
 * @return  We return the sorted list 
*/
public ArrayList<String> getSortedList()
{
    return sortBehavior.sort(items);
}
/** 
 * @return  We return the unsorted list and return previous item names
*/
public ArrayList<String> getUnSortedList(){
    return items;
}
}
    