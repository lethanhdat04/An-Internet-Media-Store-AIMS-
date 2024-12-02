package aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }
    public CompactDisc(float length, String director, String artist, ArrayList<Track> tracks) {
        super(length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, float length, String director, String artist, ArrayList<Track> tracks) {
        super(title, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, float cost, float length, String director, String artist, ArrayList<Track> tracks) {
        super(title, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    // Method add Track on CD
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("The track is already in the list.");
        }
    }

    // Method remove Track on CD
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("The track is not in the list.");
        }
    }

    // Method tinh tong do dai length cua CD
    @Override
    public float getLength() {
        float totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }


    @Override
    public void play() {
        for (Track track : tracks) {
            track.play();
        }
    }
}

