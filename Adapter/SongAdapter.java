public class SongAdapter extends Song{
    private Tune tune;

    public SongAdapter(Tune tune){
        this.tune = tune;
    }
    
    public String getTitle(){
        String[] arrOfStr = tune.getDisplayTitle().split(":");
        return arrOfStr[0];
    }
    public String getAlbum(){
        String[] arrOfStr = tune.getDisplayTitle().split(":");
        return arrOfStr[1];
    }
    public String getArtistFirstName(){
        String[] arrOfStr = tune.getArtistName().split(" ");
        return arrOfStr[0];
    }
    public String getArtistLastName(){
        String[] arrOfStr = tune.getArtistName().split(" ");
        return arrOfStr[1];
    }
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
