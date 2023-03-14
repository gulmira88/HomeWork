import java.lang.module.ModuleFinder;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Director director = new Director("James", "Cameron");
        Director director1 = new Director("Stephan", "Dj");
        Director director2 = new Director("Ernest", "Japarov");


        Cast cast1 = new Cast("Leonardo di Caprio", "Major");
        Cast cast2 = new Cast("Rose", "major");
        Cast cast3 = new Cast("Emil", "major");

        List<Cast> casts1 = new LinkedList<>();
        List<Cast> casts2 = new LinkedList<>();
        List<Cast> casts3 = new LinkedList<>();

        casts1.add(cast1);
        casts2.add(cast2);
        casts3.add(cast3);

        Movie movie1 = new Movie("Titanic", 1998, "melodrama", director, casts1);
        Movie movie2 = new Movie("flover", 2020, "humor", director1, casts2);
        Movie movie3 = new Movie("Surprise", 2018, "humor", director2, casts3);

        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);


        System.out.println("""
               1.Press 1 to movie by full a part name
               2.Press 2 to sort by year 
               3.Press 3 to sort by name
               4.Press 4 to sort by director
               5.Press 5 to find by role
               6.Press 6 to find movie description
               7.Press 7 to find movies year
               8.Press 8 to find movie by director
               """);

            Movies movies2 = new Movies();
            Searchable searchable = new Searchable();

           // movies2.findMovieByActorName(movies);
            while (true){
            int s = new Scanner(System.in).nextInt();
            switch (s) {
                case 1 -> movies2.findMovieByName(movies);
                case 2 -> searchable.sortByYear(movies);
                case 3 -> searchable.sortByMovieName(movies);
                case 4 -> searchable.sortByDirector(movies);
                case 5 -> movies2.findMovieByRole(movies);
                case 6 -> movies2.findMovieByDescription(movies);
                case 7 -> movies2.findMovieByYear(movies);
                case 8 -> movies2.findMovieByDirector(movies);


            }


        }
    }
}
