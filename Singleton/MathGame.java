package Singleton;

import java.util.Scanner;
import java.util.Random;
/** 
 * @author Abhinav
 * We create private int called score 
 * We create private random called rand 
 * We create private Scanner reader 
 * We create private String[] operands
 **/
public class MathGame {
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private Scanner reader = new Scanner(System.in);
    private String[] operands;
    private MathGame(){
        rand = new Random();
        operands = new String[4];
        operands[0] ="-";
        operands[1] ="/";
        operands[2] ="+";
        operands[3] ="*";
    };
/**
 * We create new instance of MathGame 
 * @return we return a instance of MathGame
 */
    public static MathGame getInstance(){
        if (mathGame == null) {
			System.out.println("Let's have fun with Math!");
			mathGame = new MathGame();
		}
		    return mathGame;
    }

/**
 *  We create method that will allow the user to keep playing the game till the user decides to end the game .
 */
    public void play(){
while(true){
                    System.out.print("(P)lay or (Q)uit :");
		            reader = new Scanner(System.in);
                    String PlayGame = reader.next();
		    if(PlayGame.equalsIgnoreCase("p")){
			        playRound();
		    }
		    else if(PlayGame.equalsIgnoreCase("q")){
			        System.out.println("you won " + score + " games! ");
                    System.out.println("Goodbye");
			        break;
		    }
            else{
                    System.out.println("Sorry, you must enter p or q");
            }
        }
    }
/**
 * We create a method that randomly pick a number from 1-100 and with random operand ask the user for their input if the user get the question right one point is add to the score.
 * @return We return you got it right if the user get the correct answer and if the user does not get the question we return the correct answer
 */
    private boolean playRound(){
            int randomSym = rand.nextInt(4);
            int ran = 1 + rand.nextInt(100);
            int dom = 1 + rand.nextInt(100);
            System.out.println("Round answer to 1 decimal place");
            System.out.print(ran+ " " + operands[randomSym]  + " " + dom +" = ");
            double correct;
        if(randomSym == 0){
                correct = ran-dom;
        }
        else if(randomSym == 1){
                correct = ran/dom;
        }
        else if(randomSym == 2){
                correct = ran+dom;
        }
        else{
                correct = ran*dom;
        }
        double inputedanswer = reader.nextDouble();
        if(inputedanswer == correct){
            System.out.println("You got it!");
            score++;
            play();
            return true;
        }

        else{
                System.out.println("The correct answer is:"+ correct);
                play();
                return false;
            }
    }
}
