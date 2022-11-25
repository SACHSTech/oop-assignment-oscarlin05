package netflix;

public class Shows extends Medias {

    // Instance variables 
    private int intNumSeason;

    /**
     * set constructor 
     * 
     * @param strMediaName: displays the media name 
     * @param strDirectorName: displays director name 
     * @param strGenre: displays genre 
     * @param intFilmYear: displays film year 
     * @param numSeason: displays the season from the show 
     */
    public Shows(String strMediaName, String strDirectorName, String strGenre, int intFilmYear, int numSeason) {
        super(strMediaName, strDirectorName, strGenre, intFilmYear);

    }

}
