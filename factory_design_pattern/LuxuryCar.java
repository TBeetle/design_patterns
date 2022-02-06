package factory_design_pattern;

/**
 * a generic LuxuryCar class that inherits the Car class and reutrns the Luxury Car features
 */
public class LuxuryCar extends Car{

/**
 * a generic LuxuryCar method that initializes the parameters
 * @param make
 * @param model
 */
    public LuxuryCar(String make, String model) {
        super(make, model);
    }
/**
* a protected addFrame method that prints out the frame method 
*/
    protected void addFrame() {
        System.out.println("Adding a beautiful frame");
    }
/**
 * a protected addAccessories method that returns all of the Luxury features
 */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
        accessories.add(Accessories.SPORTS_SEATS);
        accessories.add(Accessories.WINDOW_TINT);
        accessories.add(Accessories.HIGH_END_SOUND);
        accessories.add(Accessories.TRUNK_ORGANIZER);
        accessories.add(Accessories.BLUE_TOOTH);
    }
}
