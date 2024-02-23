import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieList;

    public MovieCollection() {
        movieList = new ArrayList<>();
    }
    public void AddMovie(String movieName, String genre, String director
            , int yearMade, int lengthInMinutes, boolean isInColor){
        movieList.add(new Movie(movieName, genre, director, yearMade, lengthInMinutes, isInColor));
        System.out.println("Titlen på filmen: " + movieList.get(0).getmovieName());
        System.out.println("Instrueret af " + movieList.get(0).getDirector());
        System.out.println(" ");


    // Normal arraymetode.
    /*private Movie[] movies = new Movie[5];
    int currentIndex = 0;

    public Movie[] getMovies(){
        return movies;
    }
    public void AddMovie (Movie movie){
        movies[currentIndex] = movie;
        currentIndex++;*/

    }
   @Override
   public String toString(){
        String allFilms = "";
        for (Movie m:movieList){
            allFilms += m.toString()+"\n";
        }
        return allFilms;

   }

    public String searchMovie(String search) {
        for (Movie movie : movieList) {
            if (movie.getmovieName().toLowerCase().contains(search.toLowerCase())) {
                return "Filmen findes:"+movie;
            }
        }
        return "Filmen blev ikke fundet i din filmsamling.";
    }
}





