package edu.iesam.features.songs.presentation;

import edu.iesam.features.songs.data.SongDataRepository;
import edu.iesam.features.songs.data.SongMemLocalDataSource;
import edu.iesam.features.songs.domain.DeleteSongsUseCase;
import edu.iesam.features.songs.domain.GetSongsUseCase;
import edu.iesam.features.songs.domain.SaveSongsUseCase;
import edu.iesam.features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {


    public static void printSongs() {
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(new SongDataRepository(new SongMemLocalDataSource()));

        ArrayList<Song> songsList = getSongsUseCase.execute();

        System.out.println(songsList);
    }

    public static void saveSong() {
        Song newSong = new Song("1", "Canción 1", "Author 1", "05:20");
        SaveSongsUseCase saveSongUseCase = new SaveSongsUseCase(
                new SongDataRepository(SongMemLocalDataSource.newInstance())
        );
        saveSongUseCase.execute(newSong);

        //visualizo las canciones para ver si se están añadiendo correctamente.
        printSongs();
    }

    public static void deleteSong() {
        DeleteSongsUseCase deleteSongUseCase = new DeleteSongsUseCase(new SongDataRepository(SongMemLocalDataSource.newInstance()));
        //Escojo un ID que exista, por ejemplo el 1.
        //Para probar esta funcionalidad aconsejo ejecutar esto en el main:
        //SongView.saveSong();
        //SongView.deleteSong();

        //visualizo lo que hay antes de eliminar
        printSongs();

        //Elimino
        deleteSongUseCase.execute("1");

        //visualizo las canciones para ver si se ha eliminado correctamente.
        printSongs();
    }
}
