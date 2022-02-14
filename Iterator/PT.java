package Iterator;
import java.util.ArrayList;
    /** 
    * @author Abhinav
    * We create private string called firstName.
    * We create private string called lastName.
    * We create private string called bio.
    * We create private array called Exercise[] exercises and equal to new Exercise[2].
    * We create private int called numExercies.
    **/
public class PT {

    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises= new Exercise[2];
    private int numExercises;
    /**
    * We create this.firstName equal it to firstName.
    * We create this.lastName equal it to lastName. 
    * We create this.bio equal it to bio.  
    * @param PT we get the firstName,lastName and bio on how to do the exercise.
    */
    public PT(String firstName, String lastName, String bio){
    this.firstName = firstName;
    this.lastName = lastName;
    this.bio = bio;
    }
    /**
    * This method adds the exercise
    * @param title
    * @param muscleGroups
    * @param directions
    */
    public void addExercise(String title, ArrayList<String> muscleGroups,ArrayList<String> directions){
        {
		    Exercise exercise = new Exercise(title, muscleGroups, directions);
		    if (numExercises == exercises.length) {
			    exercises = growArray(exercises);
		    }
		    exercises[numExercises] = exercise;
		    numExercises = numExercises + 1;
	    }
    }
    /**
    * We create method which return firstName.
    * @return FirstName We return a string representation of firstName.
    */
    public String getFirstName(){
    return firstName;
    }
    /**
    * We create method which return lastName.
    * @return LastName We return a string representation of lastName.
    */
    public String getLastName(){
    return lastName;
    }
    /**
    * We create method which return bio.
    * @return Bio We return a string representation of bio.
    */
    public String getBio(){
    return bio;
    }
    /**
    * We create method that doubles the size of the array.
    * @return an array of twice the size with the same data.
    */
    private Exercise[] growArray(Exercise[] exercises){
    Exercise[] temp = new Exercise[exercises.length*2];
    for(int i = 0 ; i < exercises.length; i++){
        temp[i] = exercises[i];   
    }
    return temp;
    }
    /**
    * We create method that creates a new iterator.
    * @return returns a new Exercise iterator using the exercise array.
    */
    public ExerciseIterator createIterator(){
        return new ExerciseIterator(exercises);
    }
    /**
    * We created a method prints the firstName, lastName, and the bio.
    * @return toString prints firstName, lastName, and bio.
    */
    public String toString(){
        return firstName + " " + lastName + "\n" + bio + "\n";
    }
}
