package Iterator;
import java.util.ArrayList;
/** 
 * @author Abhinav
 * We create private string called title.
 * We create private Arraylist<String> targetMuscles and equal it new ArrayList<String>().
 * We create a private Arraylist<String> directions and equal it new ArrayList<String>().
 **/

public class Exercise {
    
        private String title;
        private ArrayList<String> targetMuscles = new ArrayList<String>();
        private ArrayList<String> directions = new ArrayList<String>();
        /**
        * We create this.title equal it to title. 
        * @param Exercise we get the title of the exercise.
        */
    public Exercise(String title){
        this.title = title;
    }
        /**
        * We create this.title equal it to title.
        * We create this.targetMuscles equal it to targetMuscles. 
        * We create this.directions equal it to directions.  
        * @param Exercise we get the title , muscles the exercise targets and directions on how to do the exercise.
        */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions){
        this.title= title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }
        /**
        * We created a method which add the targeted muscles.
        * @param addTargetMuscle adds the targeted muscles.
        */
    public void addTargetMuscle(String muscle){
        targetMuscles.add(muscle);
    }
        /**
        * We created a method which removes the targeted muscles.
        * @param removeTargetMuscle removes the targeted muscles.
        */
    public void removeTargetMuscle(String muscle){
        targetMuscles.remove(muscle);
    }
        /**
        * We created a method prints the title , targetMuscles, and the direction.
        * @return toString prints title, targetMuscles, and direction.
        */
    public String toString(){
        String muscleDis =String.join(",", targetMuscles);
        String directionDis =String.join("\n- ", directions);
        return "\n... "+ title +  " ...\nMuscles:  " + muscleDis + "\nExercises: \n- " + directionDis;
    }

}
