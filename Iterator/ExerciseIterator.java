package Iterator;
import java.util.Iterator;
    /** 
    * @author Abhinav
    * We create private array called Exercise[] exercise.
    * We create private int called postitons.
    **/
public class ExerciseIterator implements Iterator {

    private Exercise[] exercises;
    private int position;
    /**
    * We create this.exercises equal it to exercises.
    * @param ExerciseIterator we create array exercise.
    */
    public ExerciseIterator(Exercise[] exercises){
    this.exercises = exercises;
    }
    /**
     * This method checks if the exercise has a open spot.
     * @return hasNext returns true if there more exercise to iterate over.
     */
    public boolean hasNext(){
        if(position >= exercises.length || exercises[position] == null) {
        return false;
        } else {
        return true;
        }
    }
    /**
    * This method goes to the next spot.
    * @return next returns the next exercise,if there is one, and null otherwise.
    */
    public Exercise next(){
        if(!hasNext()){
        return null;
        }
        Exercise exercise = exercises[position];
        position = position +1;
        return exercise;
    }
}
