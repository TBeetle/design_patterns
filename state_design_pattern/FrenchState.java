package state_design_pattern;

import java.util.ArrayList;

public class FrenchState implements State {
    private MusicBox box;
/**
 * A method FrenchState that initalizes the box 
 * @param box
 */
    public FrenchState(MusicBox box) {
		this.box = box;
	}
/**
 * A method pressStarButton that adds the lyrics to Twinkle Twinkle Little Star  
 * @param box
 */
    public void pressStarButton() {
        ArrayList<String> FrenchTwinkleLyrics = new ArrayList<String>();
        FrenchTwinkleLyrics.add("Scintille, scintille, petite étoile");
        FrenchTwinkleLyrics.add("je me demande ce que vous êtes");
        FrenchTwinkleLyrics.add("Au-dessus du monde si haut");
        FrenchTwinkleLyrics.add("Comme un diamant dans le ciel");
        FrenchTwinkleLyrics.add("Scintille, scintille, petite étoile");
        FrenchTwinkleLyrics.add("je me demande ce que vous êtes");
        
        box.playSong("Scinttille, Scintille, Petote étoile", FrenchTwinkleLyrics);
    }
/**
 * A method pressHappyButton that adds the lyrics to If You're Happy and You Know It   
 * @param box
 */
    public void pressHappyButton() {
        ArrayList<String> FrenchHappyLyrics = new ArrayList<String>();
        FrenchHappyLyrics.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        FrenchHappyLyrics.add("tu es heureux et que tu le sais, tape dans tes mains");
        FrenchHappyLyrics.add("Si tu es content et que tu le sais");
        FrenchHappyLyrics.add("Et tu veux vraiment le montrer");
        FrenchHappyLyrics.add("Si tu es heureux et que tu le sais, tape dans tes mains");

        box.playSong("Si tu es heureux et que tu le sais", FrenchHappyLyrics);
    }
/**
 * a method pressEnglishButton that lets the user know they are switching to English 
 */
    public void pressEnglishButton() {
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }
/**
 * a method pressFrenchButton that lets the user know they are already in French  
 */
    public void pressFrenchButton() {
        System.out.println("You are already in French mode");
    }
/**
 * a method pressSpanishButton that lets the user know they are switching to Spanish  
 */
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
}
