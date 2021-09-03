package com.sinkiewi.books.builders;

import com.sinkiewi.books.enums.BookCategory;
import com.sinkiewi.books.services.dtos.BookDto;

public class BookDtoBuilder {

    private Long id;
    private String title;
    private String isbn;
    private BookCategory category;


    public BookDtoBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public BookDtoBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookDtoBuilder withIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookDtoBuilder withCategory(BookCategory category) {
        this.category = category;
        return this;
    }

    public BookDto build() {
        var dto = new BookDto();
        dto.setId(this.id);
        dto.setTitle(this.title);
        dto.setIsbn(this.isbn);
        dto.setCategory(this.category);
        return dto;
    }

}
