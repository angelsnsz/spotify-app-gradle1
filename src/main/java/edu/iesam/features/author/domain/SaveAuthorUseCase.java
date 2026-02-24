package edu.iesam.features.author.domain;

import edu.iesam.features.author.domain.Author;
import edu.iesam.features.author.domain.AuthorRepository;

public class SaveAuthorUseCase {
    private AuthorRepository authorRepository;

    public SaveAuthorUseCase(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void execute(Author author) {
        authorRepository.saveAuthor(author);
    }
}
