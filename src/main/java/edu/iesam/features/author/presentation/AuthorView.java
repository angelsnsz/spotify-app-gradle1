package edu.iesam.features.author.presentation;

import edu.iesam.features.author.data.AuthorApiLocalDataSource;
import edu.iesam.features.author.data.AuthorDataRepository;
import edu.iesam.features.author.data.AuthorMemLocalDataSource;
import edu.iesam.features.author.domain.Author;
import edu.iesam.features.author.domain.DeleteAuthorUseCase;
import edu.iesam.features.author.domain.GetAuthorsUseCase;
import edu.iesam.features.author.domain.SaveAuthorUseCase;

import java.util.ArrayList;

public class AuthorView {

    public static void saveAuthor(){
        Author author= new Author("3","Rosendo","01-01-1990","Española");

        SaveAuthorUseCase saveAuthorUseCase = new SaveAuthorUseCase
                (new AuthorDataRepository(
                        AuthorMemLocalDataSource.newInstance(),
                                    new AuthorApiLocalDataSource()
                        )
                );
        saveAuthorUseCase.execute(author);
        printAuthors();
    }

    public static void printAuthors() {
        GetAuthorsUseCase getAuthorsUseCase = new GetAuthorsUseCase(
                new AuthorDataRepository(
                        AuthorMemLocalDataSource.newInstance(),
                                    new AuthorApiLocalDataSource()
                ));

        ArrayList<Author> authors =getAuthorsUseCase.execute();
        System.out.println(authors);
    }

    public static void deleteAuthor(){

        DeleteAuthorUseCase deleteAuthorUseCase =
                new DeleteAuthorUseCase(
                        new AuthorDataRepository(
                                AuthorMemLocalDataSource.newInstance(),
                                new AuthorApiLocalDataSource()
                        )
                );

        deleteAuthorUseCase.execute("1");
        printAuthors();
    }
}
