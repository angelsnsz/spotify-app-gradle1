package edu.iesam.features.songs.data;

import edu.iesam.features.songs.domain.Song;

import java.util.ArrayList;

public class SongMemLocalDataSource {
    private static SongMemLocalDataSource instance = null;

    private ArrayList<Song> storage = new ArrayList<>();

    private SongMemLocalDataSource(){
        initData();
    }

    private void initData(){
        Song song1 = new Song();
        song1.setId("1");
        song1.setTitle("Macarena");
        song1.setAuthor("Los del Rio");
        song1.setDuration("4:00");

        storage.add(song1);
    }

    public static SongMemLocalDataSource newInstance(){
        if(instance == null){
            instance = new SongMemLocalDataSource();
        }
        return instance;
    }

    public ArrayList<Song> findAll(){
        return storage;
    }

    public void save(Song song){
        storage.add(song);
    }

    public void deleteById(String id){
        storage.removeIf(song -> song.getId().equals(id));
    }
}

