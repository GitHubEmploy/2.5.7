import java.util.HashMap;

public class MediaLib {
    private HashMap<String, Book> books;
    private HashMap<String, Movie> movies;
    private HashMap<String, Song> songs;

    public static String owner = "PLTW Steven";
    private static int numEntries = 0;

    public MediaLib() {
        books = new HashMap<>();
        movies = new HashMap<>();
        songs = new HashMap<>();
    }

    public static int getNumEntries() {
        return numEntries;
    }

    public void addBook(String title, Book book) {
        books.put(title, book);
        numEntries++;
    }

    public void addMovie(String title, Movie movie) {
        movies.put(title, movie);
        numEntries++;
    }

    public void addSong(String title, Song song) {
        songs.put(title, song);
        numEntries++;
    }

    public Book getBook(String title) {
        return books.get(title);
    }

    public Movie getMovie(String title) {
        return movies.get(title);
    }

    public Song getSong(String title) {
        return songs.get(title);
    }

    public void removeBook(String title) {
        if (books.containsKey(title)) {
            books.remove(title);
            numEntries--;
        }
    }

    public void removeMovie(String title) {
        if (movies.containsKey(title)) {
            movies.remove(title);
            numEntries--;
        }
    }

    public void removeSong(String title) {
        if (songs.containsKey(title)) {
            songs.remove(title);
            numEntries--;
        }
    }

    public static String getOwner() {
        return owner;
    }

    public static void changeOwner(String newOwner) {
        owner = newOwner;
    }

    public String toString() {
        return "Current Library: " + books.values() + " // " + movies.values() + " // " + songs.values();
    }
}
