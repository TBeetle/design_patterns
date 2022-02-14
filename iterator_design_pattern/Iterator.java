package iterator_design_pattern;
/**
 * A Iterator interface that is responsible for scrolling through the Array List
 * @author Tyler Beetle
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
}
