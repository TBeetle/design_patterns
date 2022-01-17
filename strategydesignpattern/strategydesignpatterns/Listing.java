package strategydesignpattern.strategydesignpatterns;
import java.util.ArrayList;

/**
 * A generalized list of Strings that can be sorted
 * @author Tyler Beetle
 */

public class Listing {

    protected String title; 
    protected ArrayList<String> items;
    protected SortBehavior sBehavior;

/**
 * Creates a list of items and Bubble Sorts them as a default    
 * @param title of the list 
 * */

    public Listing(String title)
    {
        this.title = title;
        items = new ArrayList<String>();
        this.sBehavior = new BubbleSort();
        
    }
/**
 * Adds a item to the list
 * @param item of the type String
 */
    public void add(String item)
    {
        items.add(item);
    }
/**
 * Removes an item from a list
 * @param item of the type String
 */
    public void remove(String item)
    {
        items.remove(item);
    }
/**
 * Establishes the Title by getting it
 * @return
 */
    public String getTitle()
    {
        return title;
    }
/**
 * Sets the sort style to Insertion Sort
 * @param instance of the interface of SortBehavior
 */
    public void setSortBehavior(SortBehavior behaviorSort)
    {
        sBehavior = behaviorSort;
    }
/**
 * Accessor that gets the sorted List
 * @returns a sorted version of the list
 */
    public ArrayList<String> getSortedList()
    {
        return sBehavior.sort(items);

    }
/**
 * Accessor that gets an unsorted List
 * @return the original List
 */
    public ArrayList<String> getUnsortedList()
    {
        return items; 
    }
} 
