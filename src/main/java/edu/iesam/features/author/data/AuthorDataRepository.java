package edu.iesam.features.author.data;

import edu.iesam.features.author.domain.Author;
import edu.iesam.features.author.domain.AuthorRepository;

import java.util.ArrayList;

public class AuthorDataRepository implements AuthorRepository {

    private AuthorMemLocalDataSource authorMemLocalDataSource;
    private AuthorApiLocalDataSource authorApiLocalDataSource;

    public AuthorDataRepository(AuthorMemLocalDataSource authorMemLocalDataSource,
                                AuthorApiLocalDataSource authorApiLocalDataSource) {
        this.authorMemLocalDataSource = authorMemLocalDataSource;
        this.authorApiLocalDataSource = authorApiLocalDataSource;
    }


    @Override
    public ArrayList<Author> getAuthors() {
        return authorMemLocalDataSource.findAll();
    }
}