package edu.iesam.features.author.data;

import edu.iesam.features.author.domain.Author;
import edu.iesam.features.author.domain.AuthorRepository;

import java.util.ArrayList;

public class AuthorDataRepository implements AuthorRepository {

    private AuthorMemLocalDataSource authorMemLocalDataSource;

    public AuthorDataRepository(AuthorMemLocalDataSource authorMemLocalDataSource) {
        this.authorMemLocalDataSource = authorMemLocalDataSource;
    }


    @Override
    public ArrayList<Author> getAuthors() {
        return authorMemLocalDataSource.findAll();
    }

    @Override
    public void saveAuthor(Author author) {
        authorMemLocalDataSource.save(author);
    }

    @Override
    public void deleteAuthor(String id) {
        authorMemLocalDataSource.delete(id);
    }
}