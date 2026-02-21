package edu.iesam.features.albums.domain;

import java.util.ArrayList;

public interface AlbumRepository {

    ArrayList<Album> getAlbums();
    void saveAlbum(Album album);
}
