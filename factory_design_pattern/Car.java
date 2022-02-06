package factory_design_pattern;
import java.util.*;

/**
 * a Car class that is responsible for assembling different parts of different cars 
 * @author Tyler Beetle
 */
public abstract class Car {
    protected String make;
    protected String model;
    protected ArrayList<Object> accessories; 

    /**
     * A Car method that takes in two parameters and initializes them
     * @param make
     * @param model
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        accessories = new ArrayList<Object>();
        
    }
    /**
     * a assemble method that calls different construction methods 
     */
    public void assemble()
    {
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }
   /**
    * An abstract method that adds the Frame with no other context
    */
    protected abstract void addFrame();
    /**
     * an addWheels method that prints out to the user 
     */
    protected void addWheels() {
        System.out.println("Adding the Wheels");
    }
    /**
     * an addEngine method that prints out to the user 
     */
    protected void addEngine() {
        System.out.println("Adding the Engine");
    }
    /**
     * an addWindow method that prints out to the user 
     */
    protected void addWindows() {
        System.out.println("Adding the Windows\n");
    }
    /**
     * An abstract method that adds Accessories
     */
    protected abstract void addAccessories();

    /**
     * an displayAccessories method that prints out to the user 
     */
    protected void displayAccessories() {
        for(int i = 0; i < accessories.size();i++)
        {
            System.out.println("-"+accessories.get(i));
        }
    }
       
    
}
