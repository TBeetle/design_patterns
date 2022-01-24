package observer_design_pattern;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * a StudentGovPoll class that implements the Subject interface 
 * @author Tyler Beetle
 */
public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private HashMap<String, Integer> votes;
    private String school;
    private int numUpdates;

/**
 * Created a new class StudentGovPoll that initializes variables and establishes a new Hash Map 
 * @param school
 */
    public StudentGovPoll(String school)
    {
        observers = new ArrayList<Observer>();
        votes = new HashMap<String, Integer>();
        this.school = school;
        this.numUpdates = 0; 
    }

/**
 * Created a new class that adds an Observer 
 * @param observer
 */
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }
/**
 * Created a new class that takes away an Observer
 * @param observer
 */
    public void removeObserver(Observer observer)
    {
        observers.add(observer);
    }

/**
 * Created a new class that alerted an Observer
 */
    public void notifyObservers()
    {
        for(Observer observer: observers)
        {
               observer.update(votes);  
        }
    }
/**
 * Created a class that added a Candidate if they were not found in the Hash Map
 * @param president
 */
    public void addCandidate(String president)
    {
           votes.putIfAbsent(president, 0);
    }
/**
 * Created a class that added the recorded votes to the list in increments of 4 
 * @param president
 * @param num
 */
    public void enterVotes(String president, int num)
    {
        votes.put(president, votes.get(president) + num);
        numUpdates++;
        if(numUpdates== 4)
        {
            notifyObservers();
        }   
    }
/**
 * Created a class that returned the school from the poll
 * @return
 */
    public String getSchool()
    {
        return school;
    }


}
