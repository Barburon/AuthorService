package com.example.demo.controllers;

import com.example.demo.entity.Author;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors/find/{id}")
    public Optional<Author> findAuthorById(@PathVariable Long id){
        return authorService.findAuthorById(id);
    }

    @GetMapping("/authors")
    public List<Author> authors(){
        return authorService.authorsList();
    }

    @GetMapping("/authors/delete/{id}")
    public void deleteAuthorById(@PathVariable Long id){
        authorService.deleteAuthorById(id);
    }

    @GetMapping("/authors/add/{name}")
    public Author addAuthor(@PathVariable String name){
        return authorService.createAuthor(name);
    }

}
