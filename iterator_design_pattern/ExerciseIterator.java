package iterator_design_pattern;

import java.util.Iterator;
/**
 * A Exercise Iterator that implements the Iterator class
 */
public class ExerciseIterator implements Iterator {
    private Exercise[] exercises;
    private int position = 0;
/**
 * a Exercise Iterator method that initializes the Array List
 * @param exercises
 */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
    }
/**
 * a hasNext method that determins when the array list ends
 */
    public boolean hasNext() {
        if(position >= exercises.length || exercises[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }
/**
 * A nxt method that catalogs to the next position in the Array 
 */
    public Exercise next() {
        Exercise exercise = exercises[position];
        position = position + 1;
        return exercise; 
    }
}
