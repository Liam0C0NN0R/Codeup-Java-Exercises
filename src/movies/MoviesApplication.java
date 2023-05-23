package movies;
import util.Input;
import java.util.List;
public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        List<Movie> movies = MoviesArray.findAll();

        do {
            System.out.println("\nWhat would you like to do?");
            System.out.println("\n0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a new movie");

            int userChoice = input.getInt(0, 6);

            if (userChoice == 0) {
                break;
            } else if (userChoice == 1) {
                displayMovies(movies, null);
            } else if (userChoice == 6) {
                String name = input.getString("Enter the name of the movie: ");
                String category = input.getString("Enter the category of the movie: ");
                movies.add(new Movie(name, category));
            } else {
                String category;
                switch (userChoice) {
                    case 2:
                        category = "animated";
                        break;
                    case 3:
                        category = "drama";
                        break;
                    case 4:
                        category = "horror";
                        break;
                    case 5:
                        category = "scifi";
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + userChoice);
                }
                displayMovies(movies, category);
            }

        } while (true);

    }

    private static void displayMovies(List<Movie> movies, String category) {
        for (Movie movie : movies) {
            if (category == null || movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
}


