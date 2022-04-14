package State;

import java.util.ArrayList;

public class FrenchState implements State {
    private MusicBox box;

    public FrenchState(MusicBox box){
        this.box = box;
    }
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
    public void pressHappyButton(){
        ArrayList<String> FrenchState = new ArrayList<String>(); 
        FrenchState.add( "Si Tu as D' la Joie au Coeur"+ "\n"+
       "Si tu as d' la joie au coeur, Frappe des mains"+ "\n"+
       "Si tu as d' la joie au coeur, Frappe des mains"+ "\n"+
       "Si tu as d' la joie au coeur, Frappe des mains"+"\n"+
       "Si tu as d' la joie au coeur, Frappe des mains");
       box.playSong("Si Tu as D' la Joie au Coeur", FrenchState);
    }
    public void pressEnglishButton(){
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }
    public void pressFrenchButton(){
        System.out.println("You are already in French Mode");
    }
    public void pressSpanishButton(){
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState()); ;
    }

}
