package observer_design_pattern;

import java.util.HashMap;

/**
 * a generic Observer interface 
 * @author Tyler Beetle
 */
public interface Observer {
    public void update(HashMap<String, Integer> votes);
}
