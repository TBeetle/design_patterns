package adapter_design_pattern;
/**
 * @author
 * @description A class Oldie that implements the Tune
 */
public class Oldie implements Tune {
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category; 
/**
 * a method Oldie that establishes all of the variable
 * @param artistName
 * @param songTitle
 * @param recordTitle
 * @param category
 */
    public  Oldie(String artistName, String songTitle,String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }
/**
 * a getArtistName that returns the ArtistName
 * @return
 */
    public String getArtistName() { 
        return artistName;
    }
/**
 * a getDisplayTitle that returns the display title
 * @return
 */
    public String getDisplayTitle() { 
        return songTitle;
    }
/**
 * a getCategory that returns the category 
 * @return
 */
    public String getCategory() { 
        return category;
    }
}
