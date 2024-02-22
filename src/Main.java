import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuChoice = 0;
        int SENTINEL = 4;

        Controller controller = new Controller();

        while (menuChoice != SENTINEL) {
            System.out.println("Velkommen til min filmsamnling!");
            System.out.println("1: Opret film");
            System.out.println("2: Vis film liste");
            System.out.println("3: Søg efter film");
            System.out.println("4: Afslut");
            menuChoice = input.nextInt();
            if (menuChoice == 1) {

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
                boolean isInColor = false;

                String erIFarve = input.next();
                String erIFarve1 = erIFarve.toLowerCase();
                if (erIFarve.equals("ja")) {
                    isInColor = true;
                }
                Movie movie = new Movie(movieName, genre, director, yearMade, lengthInMinutes, isInColor);

                System.out.println(movie.getmovieName() + " Movie er lavet");
                    /*MovieCollection MovieCollection = new MovieCollection();
                    MovieCollection.AddMovie(movie);*/
                controller.addMovie(movieName, genre, director, yearMade, lengthInMinutes, isInColor);

            } else if (menuChoice == SENTINEL) {
                System.out.println("Du valgte ingen film!");

            } else if (menuChoice == 2){
                System.out.println("Vis liste af film " + controller.visMovieList());

            } else if (menuChoice == 3){
                System.out.println("Søg efter en specifik film: ");
                String searchTerm = input.next();
                controller.searchMovieCollectionMovieCollection(searchTerm);
                System.out.println("Filmen er i din samling");

            }
       /* System.out.println("Du har nu tilføjet " + movieName + " af genren " + genre +
                " instrueret af " + director + " fra " + yearMade + " som varer " + lengthInMinutes
        + " minutter");*/

        }
    }
}









