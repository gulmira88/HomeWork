import java.util.List;
import java.util.Scanner;

public class Movies implements Findable {
    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("Напиши имя кино:");
        String a = new Scanner(System.in).nextLine();
        for (Movie movie : movies) {
            if (movie.getName().equals(a)) {
                System.out.println(movie);

            }
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        String b = new Scanner(System.in).nextLine();
        for (Movie m : movies) {
            for (Cast cast : m.getCast()) {
                if (cast.getActorFullName().toUpperCase().equals(b)) {
                    System.out.println(cast.toString());
                }
            }
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
                    int b = new Scanner(System.in).nextInt();
                    for (Movie m : movies) {
                        if (m.getYear() == b) {
                            System.out.println(m);
                        }
                    }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
                    String s = new Scanner(System.in).nextLine();
                    for (Movie m : movies) {
                        if (m.getDirector().getName().equals(s)) {
                            System.out.println(m);
                        }
                    }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        String m = new Scanner(System.in).nextLine();
        for (Movie movie6 : movies) {
            if (movie6.getDescription().equals(m)) {
                System.out.println(movie6);

            }}
        }

                    @Override
                    public void findMovieByRole (List < Movie > movies) {
                        String c = new Scanner(System.in).nextLine();
                        for (Movie movie7 : movies) {
                            for (Cast cast : movie7.getCast()) {
                                if (cast.getRole().equals(c)) {
                                    System.out.println(movie7);

                                }

                            }
                        }
                    }

}