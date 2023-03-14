import java.util.*;

public class Searchable implements Sortable {
    @Override
    public void sortByMovieName(List<Movie> movies) {
        LinkedList<Movie> movies1 = new LinkedList<>();
        Collections.sort(movies);
        for (Movie movie1 : movies) {
            System.out.println(movie1);
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.sort(movieComparator);
        for (Movie movie2 : movies) {
            System.out.println(movie2);
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {

        movies.sort(sort);
        for (Movie movie3 : movies) {
            System.out.println(movie3);
        }
    }

    ;
    public static Comparator<Movie> movieComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };
    public static Comparator<Movie> sort = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear() - o1.getYear();
        }
    };
}
