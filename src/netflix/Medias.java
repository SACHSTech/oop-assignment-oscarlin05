package netflix;

public abstract class Medias {
    
    // Instance variables 
    private String strMediaName;
    private String strDirectorName;
    private String strGenre;
    private int intFilmYear;

    /**
     * set constructor 
     * @param strMediaName: displays the media name 
     * @param strDirectorName: displays the director name 
     * @param strGenre: displays the genre 
     * @param intFilmYear: displays film year
     */
    public Medias(String strMediaName, String strDirectorName, String strGenre, int intFilmYear) {

        this.strMediaName = strMediaName;
        this.strDirectorName = strDirectorName;
        this.strGenre = strGenre;
        this.intFilmYear = intFilmYear;
    }

    /**
     * 
     * @return media name 
     */
    public String getMediaName() {
        return strMediaName;
    }
    
    /**
     * 
     * @return director name 
     */
    public String getDirectorName() {
        return strDirectorName;
    }

    /**
     * 
     * @return genre 
     */
    public String getGenre() {
        return strGenre;
    }

    /**
     * 
     * @return the film year 
     */
    public int getFilmYear() {
        return intFilmYear;
    }

    /**
     * display the media information
     */
    public void Information() {
        
    }

}
