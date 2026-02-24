package edu.iesam.features.songs.data;

import edu.iesam.features.songs.domain.Song;
import edu.iesam.features.songs.domain.SongRepository;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {


    private SongMemLocalDataSource songMemLocalDataSource;

    public SongDataRepository(SongMemLocalDataSource songMemLocalDataSource){
        this.songMemLocalDataSource = songMemLocalDataSource;
    }

    @Override
    public ArrayList<Song> findAll() {
        return songMemLocalDataSource.findAll();
    }

    public void save(Song song){
        songMemLocalDataSource.save(song);
    }

    public void delete(String id){
        songMemLocalDataSource.deleteById(id);
    }
}