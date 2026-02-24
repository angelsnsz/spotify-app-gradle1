package edu.iesam.features.songs.presentation;


import edu.iesam.features.songs.data.SongDataRepository;
import edu.iesam.features.songs.data.SongMemLocalDataSource;
import edu.iesam.features.songs.domain.DeleteSongUseCase;
import edu.iesam.features.songs.domain.GetSongsUseCase;
import edu.iesam.features.songs.domain.SaveSongUseCase;
import edu.iesam.features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {

    public static void saveSong(){

        Song song = new Song();
        song.setId("2");
        song.setTitle("Flojos de pantalon");
        song.setAuthor("Rosendo");
        song.setDuration("3:30");

        SaveSongUseCase saveSongUseCase =
                new SaveSongUseCase(
                        new SongDataRepository(
                                SongMemLocalDataSource.newInstance()
                        )
                );

        saveSongUseCase.execute(song);
        printSongs();
    }

    public static void printSongs(){

        GetSongsUseCase getSongsUseCase =
                new GetSongsUseCase(
                        new SongDataRepository(
                                SongMemLocalDataSource.newInstance()
                        )
                );

        ArrayList<Song> songsList = getSongsUseCase.execute();
        System.out.println(songsList);
    }

    public static void deleteSong(){

        DeleteSongUseCase deleteSongUseCase =
                new DeleteSongUseCase(
                        new SongDataRepository(
                                SongMemLocalDataSource.newInstance()
                        )
                );

        deleteSongUseCase.execute("1");
        printSongs();
    }
}