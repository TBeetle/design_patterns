package state_design_pattern;
import java.util.ArrayList;
/**
 * A new class MusicBox 
 * @author Tyler Beetle 
 */
public class MusicBox {
    private State englishState; 
    private State frenchState;
    private State spanishState;
    private State state;
/**
 * A new method that initializes multiple States
 */
public MusicBox() {
    englishState = new EnglishState(this);
    spanishState = new SpanishState(this);
    frenchState = new FrenchState(this);
    state = new EnglishState(this);
}
/**
 * A method that points to the start button
 */
public void pressStarButton() {
    state.pressStarButton();
}
/**
 * A method that points to the happy button
 */
public void pressHappyButton() {
    state.pressHappyButton();
}
/**
 * A method that points to the english button
 */
public void pressEnglishButton() {
    state.pressEnglishButton();
}
/**
 * A method that points to the french button
 */
public void pressFrenchButton() {
    state.pressFrenchButton();;
}
/**
 * A method that points to the spanish button
 */
public void pressSpanishButton() {
    state.pressSpanishButton();
}
/**
 * A setter that sets the state
 */
public void setState(State state) { 
    this.state = state;
}
/**
 * A getter that accesses the English State 
 * @return
 */
public State getEnglishState() {
    return englishState;
}
/**
 * A getter that accesses the French State 
 * @return
 */
public State getFrenchState() {
    return frenchState;
}
/**
 * A getter that accesses the Spanish State 
 * @return
 */
public State getSpanishState() {
    return spanishState;
}
/**
 * A method that prints out the corresponding songs with the right lyrics 
 */
public void playSong(String songName, ArrayList<String> lyrics)
{
    System.out.print("\n");
    System.out.println("Now Playing: " + songName);
    for(int i = 0; i < lyrics.size(); i++)
    {
        System.out.println(lyrics.get(i));
        pause(2000);
    }
   System.out.print("\n");
}
/**
 * A method that prints out the corresponding songs with the right lyrics 
 */
public static void pause(int milisecond)
{
    try 
    {
        Thread.sleep(milisecond);
    }
    catch(InterruptedException e)
    {
        Thread.currentThread().interrupt();
    }
}
/**
 * A method that clears out the print line
 */
public static void clear()
{
    System.out.print("\033[H\033[2J");
}
}
