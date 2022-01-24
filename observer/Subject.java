package observer;
/** 
 * Subject is interface which get implemented by StudentGovPoll.
 * @author Abhinav
 **/
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
