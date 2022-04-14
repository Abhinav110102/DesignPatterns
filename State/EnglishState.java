package State;

import java.util.ArrayList;


public class EnglishState implements State {

    private MusicBox box;

    public EnglishState(MusicBox box){
       this.box = box;
    }
    public void pressStarButton(){
       ArrayList<String> EnglishState = new ArrayList<String>(); 
       EnglishState.add("Twinkle Twinkle Little Star"+ "\n"+
       "Twinkle twinkle little star" + "\n"+
       "How I wonder what you are" + "\n"+
       "Up above the world so high"+ "\n"+
       "Like a dimond in the sky"+ "\n"+
       "Twinkle twinkle little star"+ "\n"+
       "How I wonder what you are");
       box.playSong("Twinkle twinkle little star", EnglishState);
    }
    public void pressHappyButton(){
        ArrayList<String> EnglishState = new ArrayList<String>();
        EnglishState.add("If you're happy and you know it clap your hands" + "\n"+
      "If you're happy and you know it clap your hands " + "\n"+
      " If you're happy and you know it" +"\n"+
      " And you really want to show it " +"\n"+
      " If you're happy and you know it clap your hands");
        box.playSong("If you're happy and you know it", EnglishState);
    }
    public void pressEnglishButton(){
       System.out.println("You are already in English Mode"); 
    }
    public void pressFrenchButton(){
       System.out.println("Switching to French");
       box.setState(box.getFrenchState());
    }
    public void pressSpanishButton(){
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState()); ;
    }
    

}
