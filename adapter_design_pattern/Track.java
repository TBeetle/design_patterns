/**
 * @author Tyler Beetle
 * @description Creates a class Track 
 */
package adapter_design_pattern;
public class Track extends Song {
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private String genre;
/**
 * A method Track that generates all of the variables
 * @param title
 * @param album
 * @param firstName
 * @param lastName
 * @param genre
 */
    public Track(String title, String album, String firstName, String lastName, String genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.genre = genre;
    }
/**
 * a getTitle that returns the title
 * @return
 */
    public String getTitle() {
        return title;
    }
/**
 * a getAlbum that returns the album
 * @return
 */
    public String getAlbum() {
        return album;
    }
/**
 * a getArtistFirstName that returns the first name
 * @return
 */
    public String getArtistFirstName() {
        return firstName;
    }
/**
 * a getArtistLastName that returns the last name
 * @return
 */
    public String getArtistLastName() {
        return lastName;
    }
/**
 * a getGenre that returns the genre
 * @return
 */
    public String getGenre() {
        return genre;
    }
}
