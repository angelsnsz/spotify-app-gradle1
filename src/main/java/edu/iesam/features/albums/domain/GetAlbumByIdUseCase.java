package edu.iesam.features.albums.domain;

public class GetAlbumByIdUseCase{
    private AlbumRepository albumRepository;

    public GetAlbumByIdUseCase(AlbumRepository albumRepository){
        this.albumRepository = albumRepository;
    }

    public Album execute(String albumId){
        return albumRepository.getAlbum(albumId);
    }
}
