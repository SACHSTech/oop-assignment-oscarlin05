package netflix;

public class Movies extends Medias {
    
    // Instance variable
    private boolean blnAgeRestriction;

    /**
     * set constructor 
     * @param strMediaName: displays media name 
     * @param strDirectorName: displays director name 
     * @param strGenre: displays genre 
     * @param intFilmYear: displays film year 
     * @param ageRestriction: displays age restriction based on users age 
     */
    public Movies(String strMediaName, String strDirectorName, String strGenre, int intFilmYear, boolean ageRestriction) {
        super(strMediaName, strDirectorName, strGenre, intFilmYear);
    }

    /**
     * 
     * @return user agerestriction
     */
    public boolean getRestriction() {
        return blnAgeRestriction;
    }

    /**
     * show information
     */
    public void getInformation() {
        System.out.println("Movie: " + super.getMediaName() + " directed by: " + super.getDirectorName() + " filmed in " + super.getFilmYear() + " Genre: " + super.getGenre());
    }

    /**
     * print out object in string 
     */
    public String toString() {
        return "Movie: " + super.getMediaName() + " | ";
    }

}

