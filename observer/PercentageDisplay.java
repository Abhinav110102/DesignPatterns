package observer;
import java.util.HashMap;
/** 
 *  Percentage Display implements Observer class.
 * We create private hashMap that takes in String and integer and set name as votes.
 * We create private int called numVotes.
 * @author Abhinav
 **/
public class PercentageDisplay implements Observer {
private Subject poll;
private HashMap<String, Integer> votes;
private int numVotes;
/**
 * we create this.poll equal it to poll
 * We register the observer into the poll  by saying this 
 * @param Percentage Display display the percentages of votes for each candidate
 */
public PercentageDisplay(Subject poll)
{
 this.poll = poll;
 poll.registerObserver(this);
}
/** We created a method which updates the HashMap
 *@param update  updates the HashMap
 */
public void update(HashMap <String,Integer> votes)
{
    this.votes = votes;
    display();
}
/**
 * This displays the percentage of votes each candidate received from the total votes
 */
private void display()
 {
    for (String i : votes.keySet())
    {double Total = 0.0; double percent = 0.0;
        for(double input: votes.values())
        {Total += input;}
        percent =(votes.get(i)/Total)*100;
        System.out.println(i + ":" + (Math.round(percent*100))/100 + "% ");
    }
 }
}
