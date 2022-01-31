public abstract class PasswordDecorator extends Password {
    public Password passwordBeginning;
    public PasswordDecorator(Password passwordBeginning)
    {
        this.passwordBeginning = passwordBeginning;
    }

    public String getPassword() {
        return password;
    }
}
