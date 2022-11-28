package netflix;
import java.io.*;
import java.util.ArrayList;

public class MyList {
    
    // create arraylist for the movies and shows 
    private ArrayList<Movies> unrestrictedMovieList = new ArrayList<>();
    private ArrayList<Shows> unrestricedShowList = new ArrayList<>();

    private ArrayList<Movies> movieLists = new ArrayList<>();
    private ArrayList<Shows> showLists = new ArrayList<>();

    // object movies
    Movies smile = new Movies("Smile", "Parker Finn", "Horror", 2022, true);
    Movies minions = new Movies("Minions: The Rise of Gru", "Kyle Balda", "Comedy", 2022, false);
    Movies blackAdam = new Movies("Black Adam", "Jaume Collet-Serra", "Action", 2022, false);
    Movies spiderman = new Movies("Spider-Man: No Way Home", "Jon Watts", "Fantasy", 2021, false);
    Movies jumanji = new Movies("Jumanji: Welcome to the Jungle", "Jake Kasdan", "Adventure", 2017, false);

    // object shows
    Shows walkingDead = new Shows("The Walking Dead", "Greg Nicotero", "Horror", 2022, true, 11);
    Shows strangerThings = new Shows("Stranger Things", "Shawn Levy", "Action", 2022, false, 4);
    Shows lucifer = new Shows("Lucifer", "Len Wiseman", "Fantasy", 2021, false, 6);
    Shows mrbean = new Shows("Mr. Bean", "John Howard Davies", "Comedy", 1990, false, 0);
    Shows thirteenReasonsWhy = new Shows("13 Reasons Why", "Thomas Joseph McCarthy", "Adventure", 2020, true, 4);

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    // set constructor and add movies to the lists
    public MyList() {
        showLists.add(walkingDead);
        showLists.add(strangerThings);
        showLists.add(lucifer);
        showLists.add(mrbean);
        showLists.add(thirteenReasonsWhy);

        movieLists.add(smile);
        movieLists.add(minions);
        movieLists.add(blackAdam);
        movieLists.add(spiderman);
        movieLists.add(jumanji);

        unrestrictedMovieList.add(minions);
        unrestrictedMovieList.add(blackAdam);
        unrestrictedMovieList.add(spiderman);
        unrestrictedMovieList.add(jumanji);

        unrestricedShowList.add(strangerThings);
        unrestricedShowList.add(lucifer);
        unrestricedShowList.add(mrbean);

    }
    
    /**
     * 
     * @return the show list in the array list 
     */
    public ArrayList<Shows> getShowList() {
        return showLists;
    }

    /**
     * 
     * @return the movie list in the array list 
     */
    public ArrayList<Movies> getMovieList() {
        return movieLists;
    }

    /**
     * 
     * @return the restricted show list in the array list 
     */
    public ArrayList<Shows> getRestricedShowList() {
        return unrestricedShowList;
    }

    /**
     * 
     * @return the restricted movie list in the array list 
     */    
    public ArrayList<Movies> getRestrictedMovieList() {
        return unrestrictedMovieList;
    }

}