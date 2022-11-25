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

    
}