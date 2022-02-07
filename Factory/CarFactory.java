package Factory;
/** 
 * @author Abhinav
 **/
public class CarFactory {
/**
* We create if and else if statements which get the make and model from car store and return car with all features associated with that car
* @param createCar we determine what the type of car is by its make, and model
*/
   public static Car createCar(String type, String make, String model)
   {Car car = null;
    if(type.equals(CarType.small.name())) 
    {
        System.out.println("Creating a " + make +"  "+ model);
        car = new SmallCar(make, model);
    }
    else if(type.equals(CarType.sedan.name())) 
    {
        System.out.println("Creating a " + make +" "+ model);
        car  = new SedanCar(make, model);
    }
    else if(type.equals(CarType.luxury.name())) 
    {
        System.out.println("Creating a " + make +" "+ model);
        car = new LuxuryCar(make, model);
    }
    car.assemble();
    return car;
   }
/**
* @return car We return a car with all the features associated with that car
*/

}
