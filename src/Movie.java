import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Movie implements Comparable<Movie>{
    private String name;

    private int year;

    private String description;

    private Director director;
    private List<Cast> cast;


    public Movie(String name, int year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name:" + name + '\'' +
                "\n year:" + year +
                "\n description:" + description + '\'' +
                "\n director:" + director +
                "\n cast:" + cast +
                '\n';
    }



    public static Comparator<Movie> sortByDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };

    public static Comparator<Movie> sortByMovieName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Movie> sortByYear = new Comparator<Movie>() {
        @Override

        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };

    @Override
    public int compareTo(Movie o) {
        return name.compareTo(o.name);
    }
}
















