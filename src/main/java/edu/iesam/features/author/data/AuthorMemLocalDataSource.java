package edu.iesam.features.author.data;

import edu.iesam.features.author.domain.Author;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Clase para almacenar en memoria Autores.
 * No usa el patrón Singleton.
 */
public class AuthorMemLocalDataSource {

    private ArrayList<Author> authorsMemStorage = new ArrayList<>();

    public AuthorMemLocalDataSource() {
        initData();
    }

    private void initData() {
        Author author1 = new Author("1", "MemExtremoduro", "01-01-1970", "Española");
        authorsMemStorage.add(author1);

        Author author2 = new Author("2", "MemOasis", "01-01-1980", "Inglesa");
        authorsMemStorage.add(author2);
    }

    public ArrayList<Author> findAll() {
        return authorsMemStorage;
    }

    public void save(Author author) {
        authorsMemStorage.add(author);
    }

    public void delete(String authorId) {
        authorsMemStorage.removeIf(author -> Objects.equals(author.getId(), authorId));
    }
}