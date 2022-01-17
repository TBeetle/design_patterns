package strategy_design_pattern;
import java.util.ArrayList;

/*
 * A Sorting method using Insertion 
 * @author Tyler Beetle
 * 
 */
public class InsertionSort implements SortBehavior {

/*
 *Creates an Array List with the given Strings 
 *@return a list of the collected and sorted data 
 */
    public ArrayList<String> sort(ArrayList<String> data)
    {
        for(int i = 1; i < data.size(); i++)  {
            String key = data.get(i);
            int j = i - 1;
            while (j >= 0 && key.compareTo(data.get(j)) < 0) {
                data.set(j+1, data.get(j));
        
                j--;
            }
              data.set(j+1,key);
        }
        return data;
    }
    
}
