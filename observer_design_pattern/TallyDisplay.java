package observer_design_pattern;
import java.util.HashMap;
import java.util.Map;

/**
 * a TallyDisplay class that implements the Observer interface 
 * @author Tyler Beetle
 */
public class TallyDisplay implements Observer {
    protected Subject poll;
    protected HashMap<String, Integer> votes; 
  
/**
 * a new instance of the TallyDisplay class that initializes variables
 * @param poll
 */
    public TallyDisplay(Subject poll)
    {
        this.poll = poll;
        poll.registerObserver(this);    
    }
/**
 * a update class that refreshes the votes and displays the new data out
 * @param votes
 */
    public void update(HashMap<String, Integer> votes)
    {
        this.votes = votes; 
        display();
    }

/**
 * a class display that returns the amount of votes for each Candidate
 */
    public void display()
    {
        System.out.println("Current Tallies: \n");
        for(Map.Entry<String, Integer> entry : votes.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

}