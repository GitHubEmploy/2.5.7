public class MediaLibRunnerScope {
    public static void main(String[] args) {
        MediaLib myLib = new MediaLib();

        // Adding a movie, book, and song to the library
        myLib.addMovie("Raiders of the Lost Ark", new Movie("Raiders of the Lost Ark", "Spielberg"));
        myLib.addBook("1984", new Book("1984", "Orwell"));
        myLib.addSong("In Your Eyes", new Song("In Your Eyes", "Peter Gabriel"));

        // Printing the contents of the library
        System.out.println(MediaLib.getOwner() + "'s Library:\\n" + myLib);
    }
}
