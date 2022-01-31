import java.util.Random;

/**
 * a generic Special Chars class that ectends the Password Decorator class
 * @author Tyler Beetle
 */
public class SpecialChars extends PasswordDecorator {
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    char[] arr = passwordBeginning.getPassword().toCharArray();

    char[] spec = {'*', '!', '%', '+', '-', '{', '}'};

    for(int i = 0; i < arr.length; i++)
    {
        Random r = new Random();
        int x = r.nextInt(6);
        char crr = arr[1];
        int ran = (Math.random() <= 0.3) ? 1 : 2; 
        if(ran == 2)
        {
            arr[i] = crr;
        }
        else 
        {
            arr[i+1] = spec[x];
        }
        String codedPass = String.copyValueOf(arr);
        this.password = codedPass;    
        }
    }

/**
 * a new getPassword method that returns a String 
 */
    public String getPassword() {
        return password;
    }
    
}
