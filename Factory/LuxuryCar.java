package Factory;
/** 
 * @author Abhinav
 **/
public class LuxuryCar extends Car {
/**
* we call from the make constructor 
* we call from the model constructor 
* @param LuxuryCar We call from the constructor
*/
    public LuxuryCar(String make, String model)
    { 
        super(make, model);
    }
/**
 * We create a protected method that says Adding a beautiful frame to the luxury car.
 */
    protected void addFrame()
    {
        System.out.println("Adding a beautiful frame ");
    }
/**
 * We create a protected method that overwrites the default engine and says adding a Supped Up Engine to the luxury car.
 */
    @Override
    protected void addEngine()
    {
        System.out.println("Adding a Supped Up Engine");
    }
/**
 * We create a protected method that displays all the accessories associated with a luxury car.
 */
    protected void addAccessories()
    {
        System.out.println("Accessories:");
        accessories.add(Accessory.FLOOR_MATTS);
        accessories.add(Accessory.PHONE_CHARGER);
        accessories.add(Accessory.BACK_UP_CAMERA);
        accessories.add(Accessory.EXTRA_CUP_HOLDERS);
        accessories.add(Accessory.HEATED_SEATS);
        accessories.add(Accessory.SPORTS_SEATS);
        accessories.add(Accessory.WINDOW_TINT);
        accessories.add(Accessory.HIGH_END_SOUND);
        accessories.add(Accessory.TRUNK_ORGANIZER);
        accessories.add(Accessory.BLUE_TOOTH);
    }
}
