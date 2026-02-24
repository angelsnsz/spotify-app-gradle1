package edu.iesam.features.author.data;

import edu.iesam.features.author.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {

    private static AuthorMemLocalDataSource instance=null;
    public ArrayList<Author> authorsMemStorage = new ArrayList<>();

    private AuthorMemLocalDataSource() {
        initData();
    }

    private void initData(){
        Author author1 = new Author("1", "MemExtremoduro", "01-01-1970", "Española");
        authorsMemStorage.add(author1);

        Author author2 = new Author("2", "MemOasis", "01-01-1980", "Inglesa");
        authorsMemStorage.add(author2);
    }

    public ArrayList<Author> findAll(){
        return authorsMemStorage;
    }

    public void save(Author author){
        authorsMemStorage.add(author);
    }

    public static AuthorMemLocalDataSource newInstance(){
        if(instance == null){
            instance = new AuthorMemLocalDataSource();
        }
        return instance;
    }
    public void deleteById(String id){
        authorsMemStorage.removeIf(author -> author.getId().equals(id));
    }
}