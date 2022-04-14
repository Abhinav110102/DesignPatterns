package State;

import java.util.ArrayList;

public class Spanish implements State {
    private MusicBox box;

    public Spanish(MusicBox box){
        this.box = box;
    }
    public void pressStarButton(){
        ArrayList<String> SpanishState = new ArrayList<String>(); 
        SpanishState.add("Estrellita, ¿Dónde Estás?" + "\n"+
        "Estrellita, ¿dónde estás?"+ "\n"+
        "Quiero verte cintilar"+ "\n"+
        "En el cielo, sobre el mar."+ "\n"+
        "Un diamante de verdad."+ "\n"+
        "Estrellita, ¿dónde estás?"+ "\n"+
        "Quiero verte cintilar");
        box.playSong("Estrellita, ¿Dónde Estás?", SpanishState);
    }
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

        box.playSong("Si eres feliz y lo sabes", SpanishState);
    }
    public void pressEnglishButton(){
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }
    public void pressFrenchButton(){
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }
    public void pressSpanishButton(){
        System.out.println("You are already in Spanish Mode"); 
    }
}
