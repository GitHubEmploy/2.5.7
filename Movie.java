public class Movie {
    private String title;
    private int rating;
    private String director;

    public Movie(String title, String director) {
        this.title = title;
        this.rating = 0;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void adjustRating(int rating) {
        if (rating <= 10 && rating > 0)
            this.rating = rating;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null or getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return title.equals(movie.title) && director.equals(movie.director);
    }

    public int hashCode() {
        return Objects.hash(title, director);
    }

    public String toString() {
        String info = "\"" + title + "\", directed by " + director;
        if (rating != 0) {
            info += ", rating is " + rating;
        }
        return info;
    }
}
