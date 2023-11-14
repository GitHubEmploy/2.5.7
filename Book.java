public class Book {
    private String title;
    private String author;
    private int rating;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.rating = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void adjustRating(int rating) {
        if (rating <= 10 && rating > 0)
            this.rating = rating;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    public int hashCode() {
        return Objects.hash(title, author);
    }

    public String toString() {
        String info = "\"" + title + "\", written by " + author;
        if (rating != 0) {
            info += ", rating is " + rating;
        }
        return info;
    }
}
