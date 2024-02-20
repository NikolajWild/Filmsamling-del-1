import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast først filmens navn: ");
        String movieName = input.next();
        System.out.println("Indtast genren på filmen du gerne vil tilføje: ");
        String genre = input.next();
        System.out.println("Indtast nu filmens director: ");
        String director = input.next();
        System.out.println("Indtast herefter filmens udgivelses år: ");
        int yearMade = input.nextInt();
        System.out.println("Indtast nu filmens længde i minutter: ");
        int lengthInMinutes = input.nextInt();
        System.out.println("Er filmen i farve?: ");
        boolean isInColour = false;
        if (input.next().equals("Yes")) {
            isInColour = true;
        }
       /* System.out.println("Du har nu tilføjet " + movieName + " af genren " + genre +
                " instrueret af " + director + " fra " + yearMade + " som varer " + lengthInMinutes
        + " minutter");*/


            Movie movie = new Movie(movieName, genre, director, yearMade, lengthInMinutes, isInColour);
            System.out.println(movie.getmovieName() + " Movie er lavet");
            MovieCollection movieCollection = new MovieCollection();
            movieCollection.AddMovie(movie);


        }
    }

