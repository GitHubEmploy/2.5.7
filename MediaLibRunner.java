public class MediaLibRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to your Media Library");

        // Creating a new MediaLib object
        MediaLib myLib = new MediaLib();

        // Adding a book to the library
        Book myBook = new Book("The Lord of the Rings", "Tolkien");
        myLib.addBook("The Lord of the Rings", myBook);
        System.out.println("Book added: " + myBook);

        // Adjusting the rating of the book and displaying it
        int myRating = 5;
        myBook.adjustRating(myRating);
        System.out.println("Adjusted Book: " + myBook);

        // Changing the title of the book
        myBook.setTitle("Steven Bad");
        System.out.println("Updated Book: " + myBook);

        // Creating a new library and adding another book
        System.out.println("You have a NEW Library");
        MediaLib myLib2 = new MediaLib();
        Book newBook = new Book("To Kill a Mockingbird", "Lee");
        myLib2.addBook("To Kill a Mockingbird", newBook);
        System.out.println("New Library: " + myLib2);

        // Testing equality of books
        Book newBook2 = new Book("New Test Title", "Orwell");
        System.out.println("Books same? " + newBook.equals(newBook2));
        newBook.setTitle("Banana");
        System.out.println("Books same? " + newBook.equals(newBook2));

        // Adding and comparing movies
        Movie newMovie = new Movie("Inception", "Nolan");
        myLib.addMovie("Inception", newMovie);
        Movie newMovie2 = a new Movie("Oppenheimer", "Nolan");
        System.out.println("Movies same? " + newMovie.equals(newMovie2));
        System.out.println("Current Library: " + myLib);
    }
}
