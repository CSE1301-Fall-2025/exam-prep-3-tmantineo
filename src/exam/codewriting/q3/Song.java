package exam.codewriting.q3;

public class Song {

    // Instance variables
    private String name;
    private String artist;
    private int duration;  // in seconds

    // Constructor
    public Song(String name, String artist, int duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }
    // Accessor method
    public String getName() {
        return name;
    }
    // toString method
    public String toString() {
        return name + " by " + artist + " (" + duration + "s)";
    }
    /**
     * When two songs are mashed up, a new Song should be created and returned.
     * The name and artist of the new song should contain both names and both
     * artists from the original songs, and the duration should be the average
     * of the durations of the original songs.
     */
    public Song mashUp(Song other) {

        String newName = this.name + " & " + other.name;
        String newArtist = this.artist + " / " + other.artist;

        int newDuration = (this.duration + other.duration) / 2;

        return new Song(newName, newArtist, newDuration);
    }
}
