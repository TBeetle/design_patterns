package adapter_design_pattern;

public class SongAdapter extends Song {
    public Tune tune;

    public SongAdapter(Tune tune) {
        this.tune = tune;
    }
    public String getTitle() {
        return tune.getDisplayTitle();
    }
    public String getAlbum() {
        return tune.getDisplayTitle();
    }
    public String getArtistFirstName() {
        return tune.getArtistName();
    }
    public String getArtistLastName() {
        return tune.getArtistName();
    }
    public String getGenre() {
        return tune.getCategory();
    }
}
