package edu.iesam.features.albums.presentation;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.data.AlbumMemLocalDataSource;
import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.domain.GetAlbumsUseCase;
import edu.iesam.features.albums.domain.SaveAlbumUseCase;

import java.util.ArrayList;

public class AlbumView {


    public static void printAlbums(){
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(
                new AlbumDataRepository(AlbumMemLocalDataSource.newInstance())
        );
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);
    }

    public static void saveAlbum(){
        Album newAlbum = new Album("2" , "name2", "2000");
        SaveAlbumUseCase saveAlbumUseCase = new SaveAlbumUseCase(
                new AlbumDataRepository(AlbumMemLocalDataSource.newInstance())
        );
        saveAlbumUseCase.execute(newAlbum);


        printAlbums();
    }
}
