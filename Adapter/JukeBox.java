

import java.util.HashMap;

public class JukeBox {
    private HashMap<String,Song> songs;
    private int currentSong;

    public JukeBox(){
        songs = new HashMap<String,Song>();
    }
    public void addSong(Song song){

        songs.put(song.getTitle().toUpperCase(), song);
    }
    public void play(String songName){
    if(songs.containsKey(songName.toUpperCase())){
        System.out.println(songs.get(songName.toUpperCase().toString()));
    }
    else 
    {
        System.out.println("Sorry can't play the song");
    }

    }
}