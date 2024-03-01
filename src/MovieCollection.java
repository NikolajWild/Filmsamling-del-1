import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieList;

    public MovieCollection() {
        movieList = new ArrayList<>();
    }

    public void AddMovie(String movieName, String genre, String director
            , int yearMade, int lengthInMinutes, boolean isInColor) {
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
    public String toString() {
        String allFilms = "";
        for (Movie m : movieList) {
            allFilms += m.toString() + "\n";
        }
        return allFilms;

    }
    //Søger efter EN film
    /*public String searchMovie(String search) {
        for (Movie movie : movieList) {
            if (movie.getmovieName().toLowerCase().contains(search.toLowerCase())) {
                return "Filmen findes:"+movie.toString();
            }
        }
        return "Filmen blev ikke fundet i din filmsamling.";
    }
}*/
    public ArrayList<Movie> searchMovie(String search) {
        ArrayList<Movie> liste = new ArrayList<Movie>();
        for (Movie movie : movieList) {
            if (movie.getmovieName().toLowerCase().contains((search.toLowerCase()))) {
                liste.add(movie);
            }
        }

        return liste;

    }
    //Søger efter alle film der indeholder et passende input.
   /* public String searchMovie(String search) {
        String filmSearchMatches = "";
        for (Movie movie : movieList) {
            if (movie.getmovieName().toLowerCase().contains((search.toLowerCase()))) {
                filmSearchMatches += "\n" + movie.toString();
            }
        }
        if (!(filmSearchMatches.length() > 0)) {
            return "\nDer var ikke et match;";
        }
        return filmSearchMatches;
    }*/
    /*public void editMovie(String edit){
    searchMovie();
    Spørg brugeren hvilket nummer i arraylisten brugeren ønsker at ændre
    Kalder herefter arraylisten fra search
    }*/
}


