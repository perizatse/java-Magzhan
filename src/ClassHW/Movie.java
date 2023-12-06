package ClassHW;

import java.util.Objects;

public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Movie movie = (Movie) obj;

        if (!title.equals(movie.title)) return false;
        if (!studio.equals(movie.studio)) return false;
        return rating.equals(movie.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, studio, rating);
    }

    public static void main(String[] args) {
        Movie focusMovie = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie mainHeroMovie = new Movie("Главный герой", "20th Century Studios");
    }
}
