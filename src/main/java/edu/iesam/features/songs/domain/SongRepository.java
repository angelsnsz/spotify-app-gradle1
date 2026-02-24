package edu.iesam.features.songs.domain;

import java.util.ArrayList;

public interface SongRepository {
    public ArrayList<Song> findAll();

    void save(Song song);

    void delete(String id);
}
