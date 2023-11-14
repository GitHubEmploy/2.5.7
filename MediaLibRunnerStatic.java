public class MediaLibRunnerStatic {
    public static void main(String[] args) {
        // Displaying the owner of the library
        System.out.println(MediaLib.getOwner() + "'s Library");

        // Changing the owner of the library
        MediaLib.changeOwner("Banana Steven");
        System.out.println(MediaLib.getOwner() + "'s Library");

        // Creating a new MediaLib object and adding items
        MediaLib library = new MediaLib();
        library.addBook("Kitchen", new Book("Kitchen", "Banana Yoshimoto"));
        library.addMovie("The Lorax", new Movie("The Lorax", "Chris Renaud"));
        library.addSong("Ride on Time", new Song("Ride on Time", "Tatsuro Yamashita"));

        // Displaying the number of entries in the library
        System.out.println(MediaLib.getNumEntries() + " entries");

        // Attempting to add another book and displaying the library
        library.addBook("48 Laws of Power", new Book("48 Laws of Power", "Robert Greene"));
        System.out.println(library);
        System.out.println(MediaLib.getNumEntries() + " entries");

        // Testing the equals method of the Song class
        System.out.println(new Song("hi", "adele").equals(new Song("bad", "mj")));
        System.out.println(new Song("banana", "banana").equals(new Song("banana", "banana")));
    }
}
