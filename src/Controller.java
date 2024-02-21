import java.util.ArrayList;

public class Controller {
    MovieCollection movieCollection;

    public Controller() {
        movieCollection = new MovieCollection();
    }


    public void addMovie(String movieName, String genre, String director, int yearMade, int lengthInMinutes, boolean isInColour) {
        movieCollection.AddMovie(movieName, genre, director, yearMade, lengthInMinutes, isInColour);




    }
}