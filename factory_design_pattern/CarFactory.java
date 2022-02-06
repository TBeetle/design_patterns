package factory_design_pattern;

/**
 * a generic CarFactory Class used to construct different instances of car 
 * @author Tyler Beetle
 */
public class CarFactory {

    /**
 * a generic createCar method that takes in an instance of Car along with parameters
 */
    public static Car createCar(String type, String make, String model) {
        
        Car car;
        if(type == "small") {
            car = new SmallCar(make, model);
            System.out.println("Creating a "+make+" "+model);
            car.assemble();
        }
        else if (type == "sedan") {
            car = new SedanCar(make, model);
            System.out.println("Creating a "+make+" "+model);
            car.assemble();
        }
        else if (type == "luxury") {
            car = new LuxuryCar(make, model);
            System.out.println("Creating a "+make+" "+model);
            car.assemble();
        }
        else {
            car = null;
        }
        return car;
        
     
    
    }
}
