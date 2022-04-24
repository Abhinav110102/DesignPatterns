/**
* @author Abhinav Myadala
* Track extends Song class
*/
public class Track extends Song {
/**
* We create private string called title
* We create private string called album
* We create private stting called firstName
* We create private string called lastName
* We create private Genre called genre
*/
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;
/**
* We create this.title equal it to title. 
* We create this.album equal it to album.
* We create this.firstName equal it to firstName. 
* We create this.lastName equal it to lastName.
* We create this.genre equal it to genre.
* @param Track we get the title, album, first name, last name and genre of the track
*/
    public Track(String title, String album, String firstName, String lastName, Genre genre){
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }
/**
* We create method which return title.
* @return Title We return title.
*/
    public String getTitle(){
        return title;
    }
/**
* We create method which return album.
* @return Album We return album.
*/
    public String getAlbum(){
        return album;
    }
/**
* We create method which return firstName.
* @return ArtistFirstName We return firstName.
*/
    public String getArtistFirstName(){
        return firstName;
    }
/**
* We create method which return lastName.
* @return ArtistLastName We return lastName.
*/
    public String getArtistLastName(){
        return lastName;
    }
/**
* We create method which return genre.
* @return Genre We return a toString representation of genre.
*/
    public String getGenre(){
        return genre.toString();
    }


}
