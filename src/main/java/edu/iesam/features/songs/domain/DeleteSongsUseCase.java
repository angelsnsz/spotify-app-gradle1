package edu.iesam.features.songs.domain;

public class DeleteSongsUseCase {
    private SongRepository songRepository;

    public DeleteSongsUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public void execute(String id) {
        songRepository.deleteSong(id);
    }
}
