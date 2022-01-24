import java.util.HashMap;

public class Hashing {

    public Hashing() {

    }
    public void run() {
        HashMap<String,String> statesCapitals= new HashMap<>(); 
        statesCapitals.put("south Carolina", "columbia");
        statesCapitals.put("washington", "olympia");
        statesCapitals.put("florida", "tallahasee");

        System.out.println(statesCapitals.get("washington"));
    }
public static void main(String[] args){
    Hashing program = new Hashing();
    program.run();
    }   
}
