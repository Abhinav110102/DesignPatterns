/**
* @author Abhinav Myadala
* Song class is a abstract class
*/
public abstract class Song {
/**
* We create public abstract String getTitle
* We create public abstract String getAlbum
* We create public abstract String getArtistFirstName
* We create public abstract String getArtistLastName
* We create public abstract String getGenre
* We create toString method which return title, album, artistfirstname , artistlastname , and genre
* @return toString which retutns title, album, artistfirstname , artistlastname , and genre.
*/
    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();
    public String toString(){
        return getTitle() + "\n"+
        "Album: "+ getAlbum() + "\n" + 
        "By: " + getArtistFirstName() +" "+ getArtistLastName() + "\n"+
        "Genre: " + getGenre() + "\n"; 
    }

}
