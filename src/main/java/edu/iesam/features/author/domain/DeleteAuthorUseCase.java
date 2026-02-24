package edu.iesam.features.author.domain;

public class DeleteAuthorUseCase {

    private AuthorRepository authorRepository;

    public DeleteAuthorUseCase(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public void execute(String id){
        authorRepository.deleteAuthor(id);
    }
}