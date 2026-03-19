package edu.iesam.mocks;

import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.domain.AlbumRepository;

import java.util.ArrayList;

public class AlbumMockRepository implements AlbumRepository {
    @Override
    public ArrayList<Album> getAlbums() {
        ArrayList<Album>albums=new ArrayList<>();
        Album album1= new Album("1","Album1","2009");
        Album album2= new Album("2","Album2","2009");
        Album album3= new Album("3","Album3","2009");
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        return albums;
    }

    @Override
    public void saveAlbum(Album album) {

    }
}
