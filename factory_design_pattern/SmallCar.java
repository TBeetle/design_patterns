package factory_design_pattern;

/**
 * A public SmallCar class that inherits the Car class and prints out the small car features
 * @author Tyler Beetle
 */
public class SmallCar extends Car {
    public SmallCar(String make, String model) {
        super(make, model);
    }
/**
 * a protected addFrame method that prints out the frame method 
 */
    protected void addFrame() {
        System.out.println("Adding a small frame");
    }
/**
 * a protected addAccessories method that returns the accessories for a Small Car 
 */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
    }
}
