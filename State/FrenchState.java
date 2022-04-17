package State;

import java.util.ArrayList;
/**
 * @author Abhinav Myadala
 * EnglishState Implements State
 */
public class FrenchState implements State {
/**
* Create private variable called box
*/
    private MusicBox box;
/**
* We create this.box equal it to box. 
* @param box
*/
    public FrenchState(MusicBox box){
        this.box = box;
    }
/**
* We will create an array list with the lyrics to "Brille, brille, petite étoile" in French and then call the music box's playSong Method.
*/
    @Override
    public void pressStarButton(){
    ArrayList<String> FrenchState = new ArrayList<String>(); 
        FrenchState.add("Brille, brille, petite étoile,"+ "\n"+
        "Comme j’aimerais savoir qui tu es ! "+"\n"+
        "Si haut au-dessus du monde,"+"\n"+
        "Comme un diamant dans le ciel."+"\n"+
        "Brille, brille, petite étoile,"+"\n"+
        "Comme j’aimerais savoir qui tu es !") ;
        box.playSong("Brille, brille, petite étoile", FrenchState);
    }
/**
* We will create an array list with the lyrics to "Si Tu as D' la Joie au Coeur",in French and then call the music box's playSong Method.
*/
    @Override
    public void pressHappyButton(){
    ArrayList<String> FrenchState = new ArrayList<String>(); 
        FrenchState.add( "Si Tu as D' la Joie au Coeur"+ "\n"+
       "Si tu as d' la joie au coeur, Frappe des mains"+ "\n"+
       "Si tu as d' la joie au coeur, Frappe des mains"+ "\n"+
       "Si tu as d' la joie au coeur, Frappe des mains"+"\n"+
       "Si tu as d' la joie au coeur, Frappe des mains");
       box.playSong("Si Tu as D' la Joie au Coeur", FrenchState);
    }
/**
* We will just print out Switiching to English
* We Switch to EnglishState and print out the songs in English
*/
    @Override
    public void pressEnglishButton(){
    System.out.println("Switching to English");
    box.setState(box.getEnglishState());
    }
/**
* We will just print out you are already in French Mode
*/
    @Override
    public void pressFrenchButton(){
    System.out.println("You are already in French Mode");
    }
/**
* We will just print out Switiching to Spanish
* We Switch to Spanish and print out the songs in Spanish
*/
    @Override
    public void pressSpanishButton(){
    System.out.println("Switching to Spanish");
    box.setState(box.getSpanishState()); ;
    }

}
