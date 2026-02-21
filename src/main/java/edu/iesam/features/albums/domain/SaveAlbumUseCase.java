package edu.iesam.features.albums.domain;

public class SaveAlbumUseCase {

    private AlbumRepository albumRepository;


    public SaveAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void execute(Album album){
        albumRepository.saveAlbum(album);
    }
}
