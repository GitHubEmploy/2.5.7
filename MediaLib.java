import java.util.HashMap;

public class MediaLib {
    private HashMap<String, Book> books;

    public MediaLib() {
        books = new HashMap<>();
    }

    public void addBook(Book b) {
        books.put(b.getTitle(), b);
    }

    public Book getBook(String title) {
        return books.get(title);
    }

    public void removeBook(String title) {
        books.remove(title);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Media Library:\n");
        for (Book b : books.values()) {
            info.append(b).append("\n");
        }
        return info.toString();
    }
}
