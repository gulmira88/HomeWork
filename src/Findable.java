import java.util.ArrayList;
import java.util.List;

public interface Findable  {
    List <Movie>movies = new ArrayList<>();



    void findMovieByName(List<Movie>movies);



    void findMovieByActorName(List<Movie>movies);



    void findMovieByYear(List<Movie>movies);



    void findMovieByDirector(List<Movie>movies);



    void findMovieByDescription(List<Movie>movies);



    void findMovieByRole(List<Movie>movies);

}

