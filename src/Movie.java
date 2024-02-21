public class Movie {
    private String movieName;
    private String genre;
    private String director;
    private int yearMade;
    private int lengthInMinutes;
    private boolean isInColour;

    public Movie(String movieName, String director, String genre,
                 int yearMade, int lengthInMinutes, boolean isInColour) {
        this.movieName = movieName;
        this.genre = genre;
        this.director = director;
        this.yearMade = yearMade;
        this.lengthInMinutes = lengthInMinutes;
        this.isInColour = isInColour;

    }
    public String getmovieName() {
        return movieName;
    }
    public String getGenre() {
        return genre;
    }
    public String getDirector(){
        return director;
    }
    public int getYearMade (){
        return yearMade;
    }
    public int getLengthInMinutes(){
        return lengthInMinutes;
    }
    public boolean getIsInColour(){
        return isInColour;
    }

}
