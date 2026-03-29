package edu.iesam.features.author.domain;

public class DeleteAuthorsUseCase {

    private AuthorRepository authorRepository;

    public DeleteAuthorsUseCase(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void execute(String authorId) {
        authorRepository.deleteAuthor(authorId);
    }
}
