package factory_design_pattern;

/**
 * A public SedanCar class that prints out the features of a sedan car 
 * @author Tyler Beetle
 */
public class SedanCar extends Car {

/**
 * A public SedanCar method that initializes the values
 * @param make
 * @param model
 */
    public SedanCar(String make, String model) {
        super(make, model);
    }
/** 
 * a protected addFrame method that adds the Frame
 */
    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }
/** 
 * a protected addAccessories method that adds all of the Sedan accessories
*/
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }
    
}
