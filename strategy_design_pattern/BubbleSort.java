package strategy_design_pattern;
import java.util.ArrayList;

/**
 * a Bubble Sort class
 * @author Tyler Beetle
 */
public class BubbleSort implements SortBehavior {

/**
 * Creates an Array List with the given data
 * @return a sorted list of the collected data
 */
    public ArrayList<String> sort(ArrayList<String> data)
    {

    
    String temp;
    boolean complete = false; 

    while(!complete) {
        complete = true; 
        for(int i = 0; i < data.size()-1; i++) {
            if (data.get(i).compareTo(data.get(i + 1)) > 0){
                temp = data.get(i);
                data.set(i, data.get(i + 1));
                data.set(i +1, temp);
                complete = false;
            }
        }
    }

    return data;
}
    
}
