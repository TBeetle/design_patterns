package state_design_pattern;
import java.util.ArrayList;
/**
 * A class EnglishState that implements the State class
 * @author Tyler Beetle 
 */
public class EnglishState implements State {
    private MusicBox box;
/**
 * A method EnglishState that initializes the box
 * @param box
 */
    public EnglishState(MusicBox box) {
		this.box = box;
	}
/**
 * a method pressHappyButton that adds the lyrics to Twinkle Twinkle Little Star  
 */
    public void pressHappyButton() {
       ArrayList<String> happyLyricsEnglish = new ArrayList<String>();
       happyLyricsEnglish.add("If you're happy and you know it clap your hands");
       happyLyricsEnglish.add("If you're happy and you know it clap your hands");
       happyLyricsEnglish.add("If you're happy and you know it");
       happyLyricsEnglish.add("And you really want to show it");
       happyLyricsEnglish.add("If you're happy and you know it clap your hands");
       box.playSong("If You're Happy and You Know It ", happyLyricsEnglish); 
    }
/**
 * a method pressStarButton that adds the lyrics to Twinkle Twinkle Little Star  
 */
    public void pressStarButton() {
       ArrayList<String> starLyricsEnglish = new ArrayList<String>();
       starLyricsEnglish.add("Twinkle twinkle little star");
       starLyricsEnglish.add("How I wonder what you are");
       starLyricsEnglish.add("Up above the world so high");
       starLyricsEnglish.add("Like a diamond in the sky");
       starLyricsEnglish.add("Twinkle twinkle little star");
       starLyricsEnglish.add("How I wonder what you are");
       box.playSong("Twinkle Twinkle Little Star", starLyricsEnglish);
        }
/**
 * a method pressEnglishButton that lets the user know they are already in English 
 */
    public void pressEnglishButton() {
        System.out.println("You are already in English");
    }
/**
 * a method pressFrenchButton that lets the user know they are switching to French  
 */
    public void pressFrenchButton() {
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }
/**
 * a method pressSpanishButton that lets the user know they are switching to Spanish 
 */
    public void pressSpanishButton() {
        System.out.print("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
}
