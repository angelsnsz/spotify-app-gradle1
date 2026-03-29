package edu.iesam.features.albums.domain;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.data.AlbumMemLocalDataSource;
import edu.iesam.mocks.AlbumMockRepository;
import edu.iesam.mocks.EmptyAlbumMockRepository;
import edu.iesam.mocks.NullAlbumMockRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetAlbumsUseCaseTest {

    public GetAlbumsUseCase getAlbumsUseCase;
    public AlbumMockRepository albumMockRepository;
    public EmptyAlbumMockRepository emptyAlbumMockRepository;
    public NullAlbumMockRepository nullAlbumMockRepository;

    /*
        Tipo Test: Devuelve 'Algo'
        "Test que devuelve un listado con datos"
    */
    @Test
    public void shouldReturnAlbumListWhenExecuteUseCase(){
        //Give: Inicializamos variables
        albumMockRepository= new AlbumMockRepository();
        getAlbumsUseCase= new GetAlbumsUseCase(albumMockRepository);
        //When: Ejecutamos el caso de uso
        ArrayList<Album> albums= getAlbumsUseCase.execute();

        //Then: Asserts
        assertEquals(3, albums.size());
        assertEquals("1", albums.get(0).getId());
    }

    /*
    Tipo Test: Devuelve 'Algo'
    "Test que devuelve un listado vacio"
     */
    @Test
    public void shouldReturnEmptyAlbumListWhenExecuteUseCase(){
        //Give: Inicializamos variables
        emptyAlbumMockRepository= new EmptyAlbumMockRepository();
        getAlbumsUseCase= new GetAlbumsUseCase(emptyAlbumMockRepository);
        //When: Ejecutamos el caso de uso
        ArrayList<Album> albums= getAlbumsUseCase.execute();

        //Then: Asserts
        assertEquals(0,albums.size());
    }

    /*
   Tipo Test: Devuelve 'Algo'
   "Test que devuelve un nulo"
    */
    @Test
    public void shouldReturnEmptyAlbumListWhenExecuteUseCase(){
        //Give: Inicializamos variables
        nullAlbumMockRepository= new NullAlbumMockRepository();
        getAlbumsUseCase= new GetAlbumsUseCase(nullAlbumMockRepository);
        //When: Ejecutamos el caso de uso
        ArrayList<Album> albums= getAlbumsUseCase.execute();

        //Then: Asserts
        assertNull(albums);
    }
}