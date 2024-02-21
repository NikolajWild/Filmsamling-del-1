import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opret = 0;
        int afslut = 2;
        Controller nyliste = new Controller();

        while (opret != afslut) {
            System.out.println("Velkommen til min filmsamnling!");
            System.out.println("1: Opret film");
            System.out.println("2: Afslut");
            opret = input.nextInt();
            if (opret == 1) {

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
                    Movie movie = new Movie(movieName, genre, director, yearMade, lengthInMinutes, isInColour);

                    System.out.println(movie.getmovieName() + " Movie er lavet");
                    /*MovieCollection MovieCollection = new MovieCollection();
                    MovieCollection.AddMovie(movie);*/
                    nyliste.addMovie(movieName, genre, director, yearMade, lengthInMinutes, isInColour);

                } else if (opret == afslut) {
                    System.out.println("Du valgte ingen film!");
                    break;
                }

       /* System.out.println("Du har nu tilføjet " + movieName + " af genren " + genre +
                " instrueret af " + director + " fra " + yearMade + " som varer " + lengthInMinutes
        + " minutter");*/


            }
        }
    }
    }







