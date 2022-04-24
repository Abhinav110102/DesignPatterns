/**
* @author Abhinav Myadala
*/
import java.util.HashMap;

public class JukeBox {
/**
* We create private hashMap that takes in String and Song and set name as songs.
* We create private int currentSong.
*/
    private HashMap<String,Song> songs;
    private int currentSong;
/**
* We create a constructor for JukeBox
*/
    public JukeBox(){
        songs = new HashMap<String,Song>();
    }
/**
* We create method which add song to the hashMap.
*/
    public void addSong(Song song){
        songs.put(song.getTitle().toUpperCase(), song);
    }
/**
* We create a method when given the song name, as long as it is in the hashmap, it displays the strings toString or it gives a sorry message.
* @param songName
*/
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