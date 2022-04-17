package State;
/**
* @author Abhinav Myadala
*/
import java.util.ArrayList;

public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;
/**
* We initialized EnglishState 
* We initialized FrenchState
* We initialized Spanish
* We make EnglishState defalut state
*/
    public MusicBox(){
     englishState = new EnglishState(this);
     frenchState = new FrenchState(this);
     spanishState = new Spanish(this);
     state = englishState;
    }
/**
* We initialize  the pressStarButton
*/
    public void pressStarButton(){
       state.pressStarButton();
    }
/**
* We initialize  the pressHappyButton
*/
    public void pressHappyButton(){
        state.pressHappyButton();
    }
/**
* We initialize the pressEnglishButton
*/
    public void pressEnglishButton(){
        state.pressHappyButton();
    }
/**
* We initialize the pressFrenchButton
*/
    public void pressFrenchButton(){
        state.pressFrenchButton();
    }
/**
* We initialize the pressSpanishButton
*/
    public void pressSpanishButton(){
        state.pressSpanishButton();
    }
/**
* We set this.state to state
* @param state
*/
    public void setState(State state){ 
        this.state = state;
    }
/**
* We create method which return englishState.
* @return englishState
*/
    public State getEnglishState(){
       return englishState;
    }
/**
* We create method which return frenchState.
* @return frenchState
*/
    public State getFrenchState(){
       return frenchState;
    }
/**
* We create method which return spanishState.
* @return spanishState
*/
    public State getSpanishState(){
        return spanishState;
    }
/**
 * We create method that will slowly display the lyrics from the arraylist of the song.
 * @param songName
 * @param lyrics
 */
    public void playSong(String songName, ArrayList<String>lyrics){
        for(int i = 0 ; i<lyrics.size(); i++)
        {
          System.out.println(lyrics.get(i));
        }
    }
}
