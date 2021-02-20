package com.example.demo.service;

import com.example.demo.entity.Author;
import com.example.demo.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(String authorName) {
        Author author = new Author();
        author.setAuthorName(authorName);
        authorRepository.save(author);
        return author;
    }

    public void deleteAuthorById(Long id) {
        authorRepository.deleteById(id);
    }

    public Optional<Author> findAuthorById(Long id){
        return authorRepository.findById(id);
    }

    public List<Author> authorsList(){
        return authorRepository.findAll();
    }


}
