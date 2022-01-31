/**
 * A new class Symbols that inherits Password Decorator
 */
public class Symbols extends PasswordDecorator{
    
/**
 * A new class Symbols that pulls the instance of the Password class
 * @param passwordBeginning
 */
public Symbols(Password passwordBeginning)
{
    super(passwordBeginning);
}

/**
 * New class that acts as an accessor of the string
 */
public String getPassword() 
{
    String codedPass = passwordBeginning.getPassword().replace("a", "@").replace("b", "8").replace("e", "3").replace("g", "9").replace("i", "!").replace("o", "0").replace("s", "$").replace("t", "7");
    return codedPass; 
   
    }
}