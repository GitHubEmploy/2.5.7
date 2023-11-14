public class MediaLibRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to your Media Library");
        MediaLib myLib = new MediaLib();

        // Adding books
        Book lotr = new Book("The Lord of the Rings", "Tolkien");
        myLib.addBook(lotr);
        Book mockingbird = new Book("To Kill a Mockingbird", "Lee");
        myLib.addBook(mockingbird);

        // Displaying library
        System.out.println(myLib);

        // Manipulating and retrieving books
        lotr.adjustRating(5);
        Book retrievedBook = myLib.getBook("The Lord of the Rings");
        System.out.println("Retrieved Book: " + retrievedBook);

        // Removing a book
        myLib.removeBook("To Kill a Mockingbird");
        System.out.println(myLib);
    }
}
