package edu.iesam.features.author.domain;

import java.util.ArrayList;

public interface AuthorRepository {

    public ArrayList<Author> getAuthors();
    void saveAuthor(Author author);
    void deleteAuthor(String id);
}
