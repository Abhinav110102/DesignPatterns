package State;

import java.util.ArrayList;
/**
* @author Abhinav Myadala
* EnglishState Implements State
*/
public class EnglishState implements State {
/**
* Create private variable called box
*/
   private MusicBox box;
/**
* We create this.box equal it to box. 
* @param box
*/
   public EnglishState(MusicBox box){
      this.box = box;
   }
/**
* We will create an array list with the lyrics to "twinkle twinkle little star" in English and then call the music box's playSong Method.
*/
   @Override
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
/**
* We will create an array list with the lyrics to "If you're happy and you know it",in English and then call the music box's playSong Method.
*/  
   @Override
   public void pressHappyButton(){
   ArrayList<String> EnglishState = new ArrayList<String>();
      EnglishState.add("If you're happy and you know it clap your hands" + "\n"+
      "If you're happy and you know it clap your hands " + "\n"+
      " If you're happy and you know it" +"\n"+
      " And you really want to show it " +"\n"+
      " If you're happy and you know it clap your hands");
      box.playSong("If you're happy and you know it", EnglishState);
   }
/**
* We will just print out you are already in English Mode
*/
   @Override
   public void pressEnglishButton(){
   System.out.println("You are already in English Mode"); 
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
* We will just print out Switiching to Spanish
* We Switch to Spanish and print out the songs in Spanish
*/
   @Override
   public void pressSpanishButton(){
   System.out.println("Switching to Spanish");
   box.setState(box.getSpanishState()); ;
   }
    

}
