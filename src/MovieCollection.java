import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieList;

    public MovieCollection() {
        movieList = new ArrayList<>();
    }
    public void AddMovie(String movieName, String genre, String director, int yearMade, int lengthInMinutes, boolean isInColour){
        movieList.add(new Movie(movieName, genre, director, yearMade, lengthInMinutes, isInColour));
        System.out.println("Titlen på filmen: " + movieList.get(0).getmovieName());
        System.out.println("Instrueret af " + movieList.get(0).getDirector());
        System.out.println(" ");

    /*private Movie[] movies = new Movie[5];
    int currentIndex = 0;

    public Movie[] getMovies(){
        return movies;
    }
    public void AddMovie (Movie movie){
        movies[currentIndex] = movie;
        currentIndex++;*/

    }
    /*public void udskriv(){
        for(int i = 0; i < currentIndex; i++){
            System.out.println(movies[i].getmovieName());
        }*/
    }


