package netflix;

public class Movies extends Medias {
    
    // Instance variable
    private boolean blnAgeRestriction;

    // set constructor 
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


}

