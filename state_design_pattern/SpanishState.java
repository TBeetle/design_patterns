package state_design_pattern;
import java.util.ArrayList;
/**
 * A class SpanishState that implements the State class
 * @author Tyler Beetle 
 */
public class SpanishState implements State {
    private MusicBox box;
/**
 * A method SpanishState that initalizes the box 
 * @param box
 */
    public SpanishState(MusicBox box) {
		this.box = box;
	}
/**
 * A method pressStarButton that adds the lyrics to Twinkle Twinkle Little Star  
 * @param box
 */
    public void pressStarButton() {
        ArrayList<String> SpanishTwinkleLyrics = new ArrayList<String>();
        SpanishTwinkleLyrics.add("Brilla brilla pequeña estrella");
        SpanishTwinkleLyrics.add("Como me pregunto lo que eres");
        SpanishTwinkleLyrics.add("Por encima del mundo tan arriba");
        SpanishTwinkleLyrics.add("Como un diamante en el cielo");
        SpanishTwinkleLyrics.add("Brilla brilla pequeña estrella");
        SpanishTwinkleLyrics.add("Como me pregunto lo que eres");
        box.playSong("Brilla brilla pequeña estrella", SpanishTwinkleLyrics);

    }
/**
 * A method pressHappyButton that adds the lyrics to If You're Happy and You Know It   
 * @param box
 */
    public void pressHappyButton() {
        ArrayList<String> SpanishHappyLyrics = new ArrayList<String>();
        SpanishHappyLyrics.add("Si eres feliz y lo sabes aplaude");
        SpanishHappyLyrics.add("Si eres feliz y lo sabes aplaude");       
        SpanishHappyLyrics.add("si estás contento y lo sabes");
        SpanishHappyLyrics.add("Y realmente quieres mostrarlo");
        SpanishHappyLyrics.add("Si eres feliz y lo sabes aplaude");       
        box.playSong("Si eres feliz y lo sabes", SpanishHappyLyrics);

    }
/**
 * a method pressEnglishButton that lets the user know they are switching to English  
 */
    public void pressEnglishButton() {
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }
/**
 * a method pressFrenchButton that lets the user know they are switching to French  
 */
    public void pressFrenchButton() {
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }
/**
 * a method pressSpanishButton that lets the user know they are already in Spanish  
 */
    public void pressSpanishButton() {
        System.out.println("You are already in Spanish mode");
    }
}
