package Factory;
/** 
 * @author Abhinav
 **/
public class SmallCar extends Car {
/**
* We call from the make constructor.
* We call from the model constructor.
* @param SmallCar We call from the constructor
*/
    public SmallCar(String make, String model)
    {
        super(make, model);
    }
/**
* We create a protected method that says Adding a small frame to the small car.
*/
    protected void addFrame()
    {
        System.out.println("Adding a small frame ");
    }
/**
* We create a protected method that displays all the accessories associated with a small car.
*/
    protected void addAccessories()
    {
        System.out.println("Accessories:");
        accessories.add(Accessory.FLOOR_MATTS);
        accessories.add(Accessory.PHONE_CHARGER);
    }
}
