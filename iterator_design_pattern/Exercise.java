package iterator_design_pattern;

import java.util.ArrayList;
/**
 * A Exercise class
 * @author Tyler Beetle
 */
public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;
/**
 * a Constructor that establishes the title
 * @param title
 */
    public Exercise(String title) {
        this.title = title;
    }
/**
 * A Constructor that initializes multiple variables
 * @param title
 * @param targetMuscles
 * @param directions
 */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles =  targetMuscles;
        this.directions =  directions;
    }
/**
 * A method that adds a target muscle to an Array List
 * @param muscle
 */
    public void addTargetMuscle(String muscle) {
        targetMuscles.add(muscle);
    }
/**
 * A method that removes a target muscle from an Array List
 * @param muscle
 */
    public void removeTargetMuscle(String muscle) {
        targetMuscles.remove(muscle);
    }
/**
 * A method that acts as a toString and returns all of the collected data
 */
    public String toString() {

        String musString = String.join(",", targetMuscles);
        String dirString = String.join("\n- ", directions);
        return ("\n... "+title+" ...\nMuscles: "+
        musString+ "\nExercises: \n "+dirString); 
    }
}
