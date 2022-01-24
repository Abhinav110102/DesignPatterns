package observer;
import java.util.HashMap;
/** 
 *TallyDisplay implements Observer class 
 * @author Abhinav
 **/
public class TallyDisplay implements Observer{
private Subject poll;
private HashMap<String, Integer> votes;
/**
 * we create this.poll equal it to poll
 * We register the observer into the poll by saying this 
 * @param TallyDisplay Displays the votes of the candidates 
 */
public TallyDisplay(Subject poll){
    this.poll = poll;
    poll.registerObserver(this);
}
/**
 * We created a method which updates the HashMap
 * @param update updates the HashMap
 */
public void update(HashMap <String,Integer> votes){
    this.votes = votes;
    display();
}
/**
 *  This displays the number of votes each candidate received 
 */
private void display() {
    for (String i : votes.keySet()) {
        System.out.println( i + ":" + votes.get(i));
      }
}
}
