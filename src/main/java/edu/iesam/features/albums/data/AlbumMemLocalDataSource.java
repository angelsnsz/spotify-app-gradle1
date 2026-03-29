package edu.iesam.features.albums.data;

import edu.iesam.features.albums.domain.Album;

import java.util.ArrayList;
import java.util.Objects;

public class AlbumMemLocalDataSource {

    private static AlbumMemLocalDataSource instance = null;

    private ArrayList<Album> storage = new ArrayList<>();

    public ArrayList<Album> findAll() {
        return storage;
    }

    public void save(Album album) {
        storage.add(album);
    }

    public void delete(String id) {
        storage.removeIf(album -> Objects.equals(album.getId(), id));
    }

    public static AlbumMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new AlbumMemLocalDataSource();
        }

        return instance;
    }
}
