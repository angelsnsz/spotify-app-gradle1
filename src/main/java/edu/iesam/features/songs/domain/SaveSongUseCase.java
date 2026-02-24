package edu.iesam.features.songs.domain;

public class SaveSongUseCase {

    private SongRepository songRepository;

    public SaveSongUseCase(SongRepository songRepository){
        this.songRepository = songRepository;
    }

    public void execute(Song song){
        songRepository.save(song);
    }
}