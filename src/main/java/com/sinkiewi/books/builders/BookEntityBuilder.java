package com.sinkiewi.books.builders;

import com.sinkiewi.books.enums.BookCategory;
import com.sinkiewi.books.repositories.entities.BookEntity;

public class BookEntityBuilder {

    private Long id;
    private String title;
    private String isbn;
    private BookCategory category;

    public BookEntityBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public BookEntityBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookEntityBuilder withIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookEntityBuilder withCategory(BookCategory category) {
        this.category = category;
        return this;
    }

    public BookEntity build() {
        var entity = new BookEntity();
        entity.setId(this.id);
        entity.setTitle(this.title);
        entity.setIsbn(this.isbn);
        entity.setCategory(this.category);
        return entity;
    }
}
