package com.sinkiewi.books.controllers;
import com.sinkiewi.books.repositories.entities.BookEntity;
import com.sinkiewi.books.services.BooksService;
import com.sinkiewi.books.services.dtos.BookDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/books")
public class BooksController {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Book.class);

    private BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @PostMapping
    public void addBook(@RequestBody BookDto dto) {
        booksService.addBook(dto);
    }

    @GetMapping
    public List<BookEntity> getBook() {
        return booksService.getAllBooks();
    }

    @PutMapping("/{id}")
    public void updateBook (@PathVariable Long id, @RequestBody BookDto dto) {
        booksService.updateBook(id, dto);
    }

    @GetMapping("/{id}")
    public BookEntity getBookById(@PathVariable Long id) {
        return booksService.findById(id);
    }

}