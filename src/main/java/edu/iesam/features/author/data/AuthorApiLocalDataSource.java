package edu.iesam.features.author.data;

import edu.iesam.features.author.domain.Author;

import java.util.ArrayList;

public class AuthorApiLocalDataSource {

    public ArrayList<Author> authorsApiStorage = new ArrayList<>();

    public AuthorApiLocalDataSource() {
        initData();
    }

    private void initData(){
        Author author1 = new Author("1", "ApiExtremoduro", "01-01-1970", "Española");
        authorsApiStorage.add(author1);

        Author author2 = new Author("2", "ApiOasis", "01-01-1980", "Inglesa");
        authorsApiStorage.add(author2);
    }

    public ArrayList<Author> findAll(){
        return authorsApiStorage;
    }
}
