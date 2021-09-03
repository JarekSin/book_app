package com.sinkiewi.books.services;

import com.sinkiewi.books.exceptions.IsbnOfBookIsExistException;
import com.sinkiewi.books.mappers.BooksMapper;
import com.sinkiewi.books.repositories.entities.BookEntity;
import com.sinkiewi.books.repositories.BookRepository;
import com.sinkiewi.books.services.dtos.BookDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BooksService {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(BookEntity.class);


    private final BookRepository bookRepository;
    private BooksMapper booksMapper;

    public BooksService(BookRepository bookRepository, BooksMapper booksMapper) {
        this.bookRepository = bookRepository;
        this.booksMapper = booksMapper;
    }

    public List<BookEntity> getAllBooks() {
        LOGGER.info("Displaying books");
        return bookRepository.findAll();
    }

    public void addBook(BookDto dto) {
        LOGGER.info("Adding book");
        validateIfTitleExist(dto);
        var entity = booksMapper.fromDtoToEntity(dto);
        bookRepository.save(entity);
    }

    public void updateBook(Long id, BookDto dto) {
        LOGGER.info("Updating book");
        validateIfTitleExist(dto);
        var entity = bookRepository.findById(id);
        entity.ifPresent(e -> {
            e.setTitle(dto.getTitle());
            e.setIsbn(dto.getIsbn());
            bookRepository.saveAndFlush(e);
        });

    }

    public BookEntity findById(Long id) {
        LOGGER.info("Looking  book" + id);
        return bookRepository.findById(id)
                .orElseThrow();
    }

    private void validateIfTitleExist(BookDto bookDto) {
        var entity = bookRepository.findByIsbn(bookDto.getIsbn());
        if (entity.isPresent()) {
            throw new IsbnOfBookIsExistException();
        }
    }


}
