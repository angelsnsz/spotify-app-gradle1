package edu.iesam.features.songs.domain;

public class DeleteSongUseCase {

    private SongRepository songRepository;

    public DeleteSongUseCase(SongRepository songRepository){
        this.songRepository = songRepository;
    }

    public void execute(String id){
        songRepository.delete(id);
    }
}