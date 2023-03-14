import java.util.*;

public interface Sortable  {


    List<Character> characters = new ArrayList<Character>();


        void sortByMovieName(List<Movie> movies);



        void sortByYear(List<Movie> movies);


        void sortByDirector(List<Movie> movies);
    }
