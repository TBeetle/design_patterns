package adapter_design_pattern;
/**
 * @author Tyler Beetle
 * @description A class Song that creates multiple getters and a toString method
 */
public abstract class Song {
    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();
/**
 * A toString method that prints out all of the info 
 */
    public String toString() {
        return "TODO";
    }


}
