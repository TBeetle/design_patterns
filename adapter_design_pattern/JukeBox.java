package adapter_design_pattern;

import java.util.HashMap;
import java.util.jar.Attributes.Name;

public class JukeBox {
    private HashMap<String, Song> songs = new HashMap<>();
    private int currentSong;

    public JukeBox() {
        this.songs = songs;
        this.currentSong = currentSong;
    }
    public void addSong(Song song) {
        Song addSong = (Song)songs.put(song.getTitle(), song );
    }
    public void play(String songName) {
    
    }
}
