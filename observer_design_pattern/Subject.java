package observer_design_pattern;
/**
 * a generic Subject interface 
 * @author Tyler Beetle
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
