package edu.iesam.features.albums.domain;

import edu.iesam.features.albums.data.AlbumDataRepository;

public class SaveAlbumUseCase {

    private AlbumRepository albumRepository;

    public SaveAlbumUseCase(AlbumDataRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void execute(Album album){
        albumRepository.saveAlbum(album);
    }
}
