public class Movie {
    private String movieName;
    private String genre;
    private String director;
    private int yearMade;
    private int lengthInMinutes;
    private boolean isInColor;

    public Movie(String movieName, String director, String genre,
                 int yearMade, int lengthInMinutes, boolean isInColor) {
        this.movieName = movieName;
        this.genre = genre;
        this.director = director;
        this.yearMade = yearMade;
        this.lengthInMinutes = lengthInMinutes;
        this.isInColor = isInColor;

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
        return isInColor;
    }
    @Override
    public String toString(){
        String result = "";
        result += "\n" + movieName + "\n" + genre + "\n" + director + "\n" + yearMade +
                "\n" + lengthInMinutes + "\n er filmen i farve? " + isInColor;
        if(isInColor) {
            result += "ja";
        } else {
            result +="nej";
        }
        return result;
    }
}
