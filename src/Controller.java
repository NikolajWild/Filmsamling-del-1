import java.util.ArrayList;

public class Controller {
    MovieCollection movieCollection;

    public Controller() {
        movieCollection = new MovieCollection();
    }
    public void addMovie(String movieName, String genre, String director, int yearMade, int lengthInMinutes, boolean isInColor) {
        movieCollection.AddMovie(movieName, genre, director, yearMade, lengthInMinutes, isInColor);

    }
    public String visMovieList(){
        return movieCollection.toString();
    }
    public boolean searchMovie(String title) {
        return movieCollection.contains(title);
    }

    }
