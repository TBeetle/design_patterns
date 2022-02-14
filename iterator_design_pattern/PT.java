package iterator_design_pattern;

import java.util.ArrayList;
/**
 * A generic PT class 
 * @author Tyler Beetle
 */
public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;
    private int numExercises;
/**
 * A method that initializes all of the variables
 * @param firstName
 * @param lastName
 * @param bio
 */
    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio; 
        numExercises = 0; 
        this.exercises = new Exercise[2];
    }
/**
 * A method that adds an exercise to the output
 * @param title
 * @param muscleGroups
 * @param directions
 */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
        if (numExercises >= exercises.length - 1) {
            exercises = growArray(exercises);
        }
        exercises[numExercises] = new Exercise(title, muscleGroups, directions);
        numExercises++;
    }
/**
 * A method that returns the first name
 * @return
 */
    public String getFirstName() {
        return firstName;
    }
/**
 * A method that returns the last name
 * @return
 */
    public String getLastName() {
        return lastName;
    }
/**
 * A method that returns the bio of the trainer 
 * @return
 */
    public String getBio() {
        return bio;
    }
/**
 * A method grow Array that is responsible for increasing the array size after certain occurances
 * @param exercises
 * @return
 */
    private Exercise[] growArray(Exercise[] exercises) {
       int growSize = (exercises.length) * 2;
       Exercise[] newExercises = new Exercise[growSize];
       for(int i = 0; i < exercises.length; i++) {
           newExercises[i] = exercises[i];
       }
        return newExercises;
    }
/**
 * A method ExerciseIterator that establishes the Iterator
 * @return
 */
    public ExerciseIterator createIterator() {
        return new ExerciseIterator(exercises);
    }
/**
 * a toString method that is responsible for returning the data
 */
    public String toString() {
        return (this.firstName+this.lastName+this.bio); 
    }

}
