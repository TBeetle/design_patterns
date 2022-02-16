package singleton_design_pattern;

import java.util.Random;
import java.util.Scanner;
/**
 * A generic MathGame class
 * @author Tyler Beetle
 */
public class MathGame {
    
    private static MathGame mathGame;
    private int score; 
    private Random rand;
    private Scanner reader; 
    private String[] operands = {"*", "+", "-", "/"};
/**
 * A private MathGame method that initializes values and prompts the user
 */
    private MathGame() {
        this.rand = new Random();
        this.reader = new Scanner(System.in);
        System.out.println("Lets Have Fun with Math!");
    }
/**
 * a getInstance method that checks if there is an instance of the MathGame class 
 * and can create one if needed
 * @return
 */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }
/**
 * a play method that is responsible for looping through and asking the user if they 
 * want to play again or quit and see their score 
 */
    public void play() {
        while(true) { 
            System.out.println("(P)lay or (Q)uit: ");
            String decision = reader.next();
            if(decision.equalsIgnoreCase("p")) {
                playRound();
            }
            else if(decision.equalsIgnoreCase("q")) {
                System.out.println("You won "+score+" games");
                break;
            }
            else if(decision != ("q,p,P,Q")) {
                System.out.println("You must enter p or q");
                play();
            }
        }
    }
    /**
     * a private playRound method that contains the contents of the math game 
     * @return
     */
    private boolean playRound() {
        int value1 = rand.nextInt(100) * 1;
        int value2 = rand.nextInt(100) * 1;
        String oper = operands[rand.nextInt(4)];
        System.out.println(" ");
        System.out.println("Round answer to 1 decimal place");
        if(oper == "*") {
            System.out.println(value1+" * "+value2+" =");
            double ans = reader.nextDouble();
            if(ans == value1*value2) {
                System.out.println("You got it!");
                score++;
                return true;
            }
            else {
                System.out.println("The correct answer is: "+value1*value2);
                return false;
            } 
        }
        else if(oper == "/") {
            System.out.println(value1+" / "+value2+" =");
            double ans = reader.nextDouble();
            if(ans == value1/value2) {
                System.out.println("You got it!");
                score++;
                return true;
            }
            else {
                System.out.println("The correct answer is: "+value1/value2);
                return false;
            } 
        }
        else if(oper == "-") {
            System.out.println(value1+" - "+value2+" =");
            double ans = reader.nextDouble();
            if(ans == value1+-value2) {
                System.out.println("You got it!");
                score++;
                return true;
            }
            else {
                System.out.println("The correct answer is: "+value1+-value2);
                return false;
            } 
        }
        else if(oper == "+") {
            System.out.println(value1+" + "+value2+" =");
            double ans = reader.nextDouble();
            if(ans == value1+value2) {
                System.out.println("You got it!");
                score++;
                return true;
            }
            else {
                System.out.println("The correct answer is: "+value1+value2);
                return false;
            } 
        }
        return true;
    }
}
