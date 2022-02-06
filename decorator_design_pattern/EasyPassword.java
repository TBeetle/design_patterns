package decorator_design_pattern;

/**
 * A new class EasyPassword that inherits the EasyPassword class
 * @author Tyler Beetle
 */
public class EasyPassword extends Password {

/**
 * A new method that initializes the string
 * @param phrase
 */
    public EasyPassword(String phrase)
    {
        this.password = phrase;
    }
/**
 * A new method that acts as an accessor and removes the white space from the String
 */
    public String getPassword()
    {
        int random = (int)(Math.random()*100);
        password.trim();
        password += random;
        return password; 
    }
    
}
