package edu.iesam.features.albums.domain;

public class DeleteAlbumUseCase {

    private AlbumRepository albumRepository;

    public DeleteAlbumUseCase(AlbumRepository albumRepository){
        this.albumRepository = albumRepository;
    }

    public void execute(String id){
        albumRepository.deleteAlbum(id);
    }
}
