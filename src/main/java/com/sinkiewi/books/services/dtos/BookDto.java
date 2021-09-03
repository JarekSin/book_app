package com.sinkiewi.books.services.dtos;

import com.sinkiewi.books.enums.BookCategory;

import java.util.Objects;

public class BookDto {

    private Long id;
    private String title;
    private String isbn;
    private BookCategory category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return Objects.equals(id, bookDto.id) &&
                Objects.equals(title, bookDto.title) &&
                Objects.equals(isbn, bookDto.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, isbn);
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
