package observer_design_pattern;
import java.util.*;
import java.util.HashMap;

/**
 * a PercentageDisplay class that implements the Observer interface 
 * @author Tyler Beetle
 */
public class PercentageDisplay implements Observer {
    protected Subject poll;
    protected HashMap<String, Integer> votes; 
    protected int numVotes;

/**
 * a new PercentageDisplay class that initializes variables
 *@param poll 
 */ 
    public PercentageDisplay(Subject poll)
    {
        this.poll = poll;
        poll.registerObserver(this);

    }
/**
 * a new update class that takes in the new vote count and calls to the display
 * @param votes
 */
    public void update(HashMap<String, Integer> votes)
    {
        this.votes = votes; 
        display();
    }
/**
 * a new display class that calculates the percentage of votes per candidate and returns it to the user
 */
    public void display()
    {
        System.out.println("Current Percent of Votes: \n");
        for(Map.Entry<String, Integer> entry : votes.entrySet())
        {
            numVotes += entry.getValue();
        }
        for(Map.Entry<String, Integer> entry : votes.entrySet())
        {
            double vote = entry.getValue();
            System.out.format(entry.getKey()+" : "+"%.1f",vote / numVotes * 100);
            System.out.println();
        }
    }
}
