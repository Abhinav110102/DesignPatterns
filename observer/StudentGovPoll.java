package observer;
import java.util.ArrayList;
import java.util.HashMap;
/** 
 * @author Abhinav
 * We create private Arraylist<Observer> and set name as observers
 * We create private hashMap that takes in String and integer and set name as votes
 * We create a String called School
 * We create int called numUpdates
 **/
public class StudentGovPoll implements Subject {
private ArrayList<Observer> observers;
private HashMap<String, Integer> votes;    
private String School;
private int numUpdates;
/**
 * We create a constructor for StudentGovPoll
 */
public StudentGovPoll(String School) {
this.School = School;
observers = new ArrayList<Observer>();
votes = new HashMap<String, Integer>();
}
/**
 * We created a method which register the observer
 * @param registerObserver register the observer
 */
//@Override
public void registerObserver(Observer observer){
 observers.add(observer);
}
/**
 * We created a method which removes the observer 
 * @param removeObserver removes the observers
 */
//@Override
public void removeObserver(Observer observer){
 observers.remove(observer);
}
/**
 * We created a method which notify the observers
 */
public void notifyObservers(){
    for(Observer observer: observers){
        observer.update(votes);
    }
}
/**
 * We create method which add the candidates
 * @param addCandidate adds the candidates
 */
public void addCandidate(String president){
    votes.put(president, 0);
}
/**
 * We create method  which enters the votes 
 * @param enterVotes enter the votes
 */
public void enterVotes(String president, int num){
    votes.put(president, votes.get(president) + num);
    numUpdates++;
    if(numUpdates== 4){
        notifyObservers();
    }
}
/**
 * We create method which return school
 * @return We return a string representation of school
 */
public String getSchool(){
    return School;
}
}
