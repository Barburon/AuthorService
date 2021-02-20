package com.example.demo;

import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorCLR implements CommandLineRunner {

    private final AuthorService authorService;

    public AuthorCLR(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public void run(String... args) throws Exception {
        List.of("Author1", "Author2", "Author3", "Author4", "Author5").forEach(authorService::createAuthor);
    }
}
