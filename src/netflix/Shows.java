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
    public Shows(String strMediaName, String strDirectorName, String strGenre, int intFilmYear, boolean ageRestriction, int numSeason) {
        super(strMediaName, strDirectorName, strGenre, intFilmYear);
    }

    /**
     * 
     * @return the number of seasons 
     */
    public int getNumSeasons() {
        return intNumSeason;
    }

    /**
     * 
     * @param intNumSeason allow user to change the seasons 
     */
    public void setNumSeasons(int intNumSeason) {
        this.intNumSeason = intNumSeason;
    }

    public void Information() {
        System.out.println("Show: " + super.getMediaName() + " directed by: " + super.getDirectorName() + " filmed in " + super.getFilmYear() + " Genre: " + super.getGenre() + "Seasons: " + getNumSeasons());
    }

     /**
      * display object in string
      */
      public String toString() {
        return "Show: " + super.getMediaName() + ", directed by: " + super.getDirectorName() + ", filmed in " + super.getFilmYear() + ", Genre: " + super.getGenre() +" | ";
    }

}
