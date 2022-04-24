/**
* @author Abhinav Myadala
* Oldie class implements Tune class
*/
public class Oldie implements Tune {
/**
* We create private string called artistName
* We create private string called songTitle
* We create private stting called recordTitle
* We create private string called category
*/
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

/**
* We create this.artistName equal it to artistName. 
* We create this.songTitle equal it to songTitle.
* We create this.recordTitle equal it to recordTitle. 
* We create this.category equal it to category.
*/
    public Oldie(String artistName, String songTitle, String recordTitle, String category){
        this.artistName = artistName;
        this.songTitle = songTitle; 
        this.recordTitle = recordTitle;
        this.category = category;
    }
/**
* We create method which return artistName.
* @return ArtistName We return the artistName.
*/
    public String getArtistName(){
        return artistName;
    }
/**
* We create method which return songTitle and recordTitle.
* @return DisplayTitle We return the songTitle and recordTitle.
*/
    public String getDisplayTitle(){
        return songTitle +":" + recordTitle;
    }
/**
* We create method which return category.
* @return Category We return category.
*/
    public String getCategory(){
        return category;
    }

}
