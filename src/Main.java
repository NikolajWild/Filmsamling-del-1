import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuChoice = 0;
        int SENTINEL = 4;
        //Kalder min controller så jeg kan bruge dens metoder i main metoden
        Controller controller = new Controller();
        //While loop som får hele menuen til at fungere, ved at bruge en sentinel for at navigere rundt i menuen.
        while (menuChoice != SENTINEL) {
            System.out.println("Velkommen til min filmsamnling!");
            System.out.println("1: Opret film");
            System.out.println("2: Vis film liste");
            System.out.println("3: Søg efter film");
            System.out.println("4: Afslut");
            menuChoice = input.nextInt();
            input.nextLine();
            if (menuChoice == 1) {
                System.out.println("Indtast først filmens navn: ");
                String movieName = input.nextLine();
                System.out.println("Indtast nu filmens director: ");
                String genre = input.nextLine();
                System.out.println("Indtast genren på filmen du gerne vil tilføje: ");
                String director = input.nextLine();
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
                controller.addMovie(movieName, genre, director, yearMade, lengthInMinutes, isInColor);
                System.out.println(movie.getmovieName() + " \nFilmen er nu tilføjet!");

            } else if (menuChoice == SENTINEL) {
                System.out.println("\nDu valgte ingen film!");

            } else if (menuChoice == 2){
                System.out.println("\nVis liste af film " + controller.visMovieList());

            } else if (menuChoice == 3) {

                System.out.println("Søg efter en specifik film: ");
                System.out.println("Indtast filmens navn: ");
                String movieName = input.nextLine();
                System.out.println(controller.searchMovie(movieName));
            } else {
                System.out.println("\nUgyldigt valg. Prøv igen.");
            }
        }
    }
}









