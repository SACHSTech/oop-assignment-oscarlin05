package netflix;

public class MyList {

    // Instance variables 
    private int intMaxShow;
    private int intMaxMovie;
    private boolean blnCanAddShow;
    private boolean blnCanAddMovie;

    // set constructor 
    public MyList(int show, int movie) {
        intMaxShow = show;
        intMaxMovie = movie;

        if (intMaxShow == 3) {
            blnCanAddShow = false;
        }
        else {
            blnCanAddShow = true;
        }

        if (intMaxMovie == 3) {
            blnCanAddMovie = false;
        }
        else {
            blnCanAddMovie = true;
        }
    }

    /**
     * 
     * @return get maximum amount of movie that user can add 
     */
    public int getMaxMovie() {
        return intMaxMovie;
    }

    /**
     * 
     * @return get maximum amount of shows that user can add 
     */
    public int getMaxShow() {
        return intMaxShow;
    }

    /**
     * 
     * @return if show can still be added 
     */
    public boolean getCanAddShow() {
        return blnCanAddShow;
    }

    /**
     * 
     * @return if movie can still be added
     */
    public boolean getCanAddMovie() {
        return blnCanAddMovie;
    }
    
}