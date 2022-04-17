package State;

import java.util.ArrayList;
/**
* @author Abhinav Myadala
* Spanish Implements State
*/
public class Spanish implements State {
/**
* Create private variable called box
*/
    private MusicBox box;
/**
* We create this.box equal it to box. 
* @param box
*/
    public Spanish(MusicBox box){
        this.box = box;
    }
/**
* We will create an array list with the lyrics to "Estrellita, ¿Dónde Estás?" in Spanish and then call the music box's playSong Method.
*/
    @Override
    public void pressStarButton(){
    ArrayList<String> SpanishState = new ArrayList<String>(); 
        SpanishState.add("Estrellita, ¿Dónde Estás?" + "\n"+
        "Estrellita, ¿dónde estás?"+ "\n"+
        "Quiero verte cintilar"+ "\n"+
        "En el cielo, sobre el mar."+ "\n"+
        "Un diamante de verdad."+ "\n"+
        "Estrellita, ¿dónde estás?"+ "\n"+
        "Quiero verte cintilar");
        box.playSong("Estrellita, ¿Dónde Estás?", Spanish);
    }
/**
* We will create an array list with the lyrics to "Si eres feliz y lo sabes",in Spanish and then call the music box's playSong Method.
*/  
    @Override
    public void pressHappyButton(){
    ArrayList<String> SpanishState = new ArrayList<String>(); 
        SpanishState.add("Si eres feliz y lo sabes"+ "\n"+
        "Bate las manos"+ "\n"+
        "Si eres feliz y lo sabes"+ "\n"+
        "Bate las manos" + "\n"+
        "Si eres feliz y lo sabes" + "\n"+
        "Entonces pon las señales" + "\n"+
        "Si eres feliz y lo sabes" + "\n"+
        "Bate las manos");
        box.playSong("Si eres feliz y lo sabes", Spanish);
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
* We will just print out Switiching to French
* We Switch to FrenchState and print out the songs in french
*/
    @Override
    public void pressFrenchButton(){
    System.out.println("Switching to French");
    box.setState(box.getFrenchState());
    }
/**
* We will just print out you are already in Spanish Mode
*/
    @Override
    public void pressSpanishButton(){
    System.out.println("You are already in Spanish Mode"); 
    }
}
