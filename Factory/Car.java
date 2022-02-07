package Factory;
import java.util.ArrayList;
/** 
 * @author Abhinav
 * We create private string called make 
 * We create private string called model 
 * We create protected Arraylist<Accessory> accessories and equal it new ArrayList<Accessory>
 **/
public abstract class Car {
    private String make;
    private String model;
    protected  ArrayList<Accessory> accessories = new ArrayList<Accessory>();
/**
 * We create this.make equal it to make. 
 * We create this.model equal it to model.
 * @param Car we get the make and model of the car
 */
    public Car(String make , String model)
    {
        this.make = make;
        this.model = model;
    }
/**
 * We create a method that assembles all the part of the car.
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
 * We create a protected abstract method that add the frames for different cars.
 */
    protected abstract void addFrame();
/**
 * We create a protected method that says adding the Wheels .
 */
    protected void addWheels()
    {
        System.out.println("Adding the Wheels");
    }
/**
 * We create a protected method that says adding a Standard Engine to the cars.
 */
    protected void addEngine()
    {
        System.out.println("Adding a Standard Engine");
    }
/**
 * We create a protected method that says adding Windows to the cars.
 */
    protected void addWindows()
    {
        System.out.println("Adding Windows");
    }
/**
 * We create a protected abstract method that add the Accessories for different cars.
 */
    protected abstract void addAccessories();
/**
 * We create a protected method that displays All the accessories that each car has. Also I used this source to help me print the list of accessories https://www.geeksforgeeks.org/arraylist-foreach-method-in-java/
 */
    protected void displayAccessories()
    {
        accessories.forEach(accessory ->
        {
            System.out.println("- " + accessory );
        }
        );
    }

    
}
