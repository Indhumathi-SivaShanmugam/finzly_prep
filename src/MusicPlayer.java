//IMPLEMENTATION OF LinkedList
// PROPERTIES focussed: fast insertion/deletion in constant time , no mem waste , no resizing overhead like arraylist(flexible size)
import java.util.LinkedList;
import java.util.ListIterator;

public class MusicPlayer {
    private LinkedList<String> playlist = new LinkedList<>();
    private ListIterator<String> iterator;

    public MusicPlayer() {
        playlist.add("Bohemian Rhapsody");
        playlist.add("Stairway to Heaven");
        playlist.add("Hotel California");
        iterator = playlist.listIterator();
    }

    // Add song to end (O(1))
    public void addSong(String song) {
        playlist.addLast(song);
        System.out.println("Added: " + song);
    }

    // Play next (pointer navigation)
    public void playNext() {
        if (iterator.hasNext()) {
            System.out.println("Now playing: " + iterator.next());
        } else {
            System.out.println("End of playlist!");
        }
    }

    // Play previous (bidirectional traversal)
    public void playPrevious() {
        if (iterator.hasPrevious()) {
            System.out.println("Now playing: " + iterator.previous());
        } else {
            System.out.println("Start of playlist!");
        }
    }

    // Remove current song (O(1))
    public void removeCurrent() {
        iterator.remove();
        System.out.println("Song removed");
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.playNext(); // Bohemian Rhapsody
        player.playNext(); // Stairway to Heaven
        player.addSong("Sweet Child O' Mine");
        player.playPrevious(); // Back to Stairway
        player.removeCurrent(); // Deletes Stairway
    }
}