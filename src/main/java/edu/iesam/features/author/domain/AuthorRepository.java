package edu.iesam.features.author.domain;

import java.util.ArrayList;

public interface AuthorRepository {

    public ArrayList<Author> getAuthors();

    public void saveAuthor(Author author);

    public void deleteAuthor(String id);

}
