package edu.iesam.features.songs.presentation;

import edu.iesam.features.songs.data.SongBdDataRepository;
import edu.iesam.features.songs.domain.GetSongsUseCase;
import edu.iesam.features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {


    public static void printSongs(){
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(new SongBdDataRepository());

        ArrayList<Song> songsList = getSongsUseCase.execute();

        System.out.println(songsList);
    }
}
