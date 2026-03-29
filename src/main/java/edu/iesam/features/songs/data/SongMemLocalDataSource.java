package edu.iesam.features.songs.data;

import edu.iesam.features.songs.domain.Song;
import edu.iesam.features.songs.domain.SongRepository;

import java.util.ArrayList;
import java.util.Objects;

public class SongMemLocalDataSource {

    private static SongMemLocalDataSource instance = null;

    private ArrayList<Song> storage = new ArrayList<>();

    public ArrayList<Song> findAll() {
        return storage;
    }

    public void save(Song song) {
        storage.add(song);
    }

    public void delete(String id) {
        storage.removeIf(song -> Objects.equals(song.getId(), id));
    }

    public static SongMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new SongMemLocalDataSource();
        }

        return instance;
    }

}
