package decorator_design_pattern;

/**
 * A RandomCasing Class that inherits the PasswordDecorator class
 * @author Tyler Beetle
 */
public class RandomCasing extends PasswordDecorator {

/**
 * A new method RandomCasing that converts the object Password to string
 * @param passwordBeginning
 */
    public RandomCasing(Password passwordBeginning)
{
    super(passwordBeginning);
    
    char[] randomArr = passwordBeginning.getPassword().toCharArray();

    for(int i = 0; i < randomArr.length; i++) {
        int j = (Math.random() <= 0.5) ? 1 : 2; 
        char l = Character.toLowerCase(randomArr[i]);

        if( j == 1)
        {
            randomArr[i] = l;
        }
        else
        {
            randomArr[i] = Character.toUpperCase(l);
        }

        String caseString = String.copyValueOf(randomArr);
        this.password = caseString; 


    }
}

/**
 * A new method getPassword that acts as an accesor
 * @return
 */
public String getPassword() 
{
    return password;
}

}
