package Factory;
/** 
 * @author Abhinav
 **/
public class SedanCar extends Car {
/**
* We call from the make constructor 
* We call from the model constructor 
* @param SedanCar We call from the constructor
*/
    public SedanCar(String make, String model)
    {
        super(make, model);
    }
/**
* We create a protected method that says Adding a three part frame to the sedan car.
*/
    protected void addFrame()
    {
        System.out.println("Adding a three part frame ");
    }
/**
 * We create a protected method that displays all the accessories associated with a sedan car.
 */
    protected void addAccessories()
    {
        System.out.println("Accessories:");
        accessories.add(Accessory.FLOOR_MATTS);
        accessories.add(Accessory.PHONE_CHARGER);
        accessories.add(Accessory.BACK_UP_CAMERA);
        accessories.add(Accessory.EXTRA_CUP_HOLDERS);
        accessories.add(Accessory.HEATED_SEATS);
    }
}
