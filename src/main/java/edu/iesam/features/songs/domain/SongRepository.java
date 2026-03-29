package edu.iesam.features.songs.domain;

import java.util.ArrayList;

public interface SongRepository {
    void saveSong(Song song);

    public ArrayList<Song> getSongs();

    void deleteSong(String songId);
}
