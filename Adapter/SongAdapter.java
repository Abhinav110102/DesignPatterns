/**
* @author Abhinav Myadala
SongAdapter extends song class
*/
public class SongAdapter extends Song{
/**    
* We create private Tune called tune
*/
    private Tune tune;
/**
* We create this.tune equal it to tune. 
@param SongAdapter we get the tune from the SongAdapter
*/
    public SongAdapter(Tune tune){
        this.tune = tune;
    }
/**
* We create method which return title from displaytitle in oldie class.
* @return Title We return a string array which is split and return a representation of title.
*/
    public String getTitle(){
        String[] arrOfStr = tune.getDisplayTitle().split(":");
        return arrOfStr[0];
    }
/**
* We create method which return album from displaytitle in oldie class.
* @return Album We return a string array which is split and return a representation of album.
*/
    public String getAlbum(){
        String[] arrOfStr = tune.getDisplayTitle().split(":");
        return arrOfStr[1];
    }
/**
* We create method which return firstName from ArtistName in the oldie class.
* @return ArtistFirstName We return a string array which is split and return a representation of firstName.
*/
    public String getArtistFirstName(){
        String[] arrOfStr = tune.getArtistName().split(" ");
        return arrOfStr[0];
    }
/**
* We create method which return lastName from ArtistName in the oldie class.
* @return ArtistLastName We return a string array which is split and return a representation of lastName.
*/
    public String getArtistLastName(){
        String[] arrOfStr = tune.getArtistName().split(" ");
        return arrOfStr[1];
    }
/**
* We create method which return genre from Category in the oldie class.
* @return Genre We return a tostring which represents of Category.
*/
    public String getGenre(){
        if(tune.getCategory().equalsIgnoreCase("Country and Western")){
            return Genre.COUNTRY.toString();
        }
        else if(tune.getCategory().equalsIgnoreCase("R&B and Soul")){
            return Genre.JAZZ.toString();
        }
        else if(tune.getCategory().equalsIgnoreCase("Easy Listening")){
            return Genre.HIPHOP.toString();
        }
        else if(tune.getCategory().equalsIgnoreCase("Rock")){
            return Genre.ROCK.toString();
        }
        else if(tune.getCategory().equalsIgnoreCase("Classic Rock")){
            return Genre.ROCK.toString();
        }
        else
        {
            return Genre.OTHER.toString();
        }
    }

}
