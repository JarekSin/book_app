package com.sinkiewi.books.repositories.entities;

import com.sinkiewi.books.enums.BookCategory;

import javax.persistence.*;
import java.util.Objects;


@Entity
//@Table(uniqueConstraints= @UniqueConstraint(columnNames={"isbn"}))
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;

   @Enumerated(EnumType.STRING)
    private BookCategory category;

    public BookEntity() {
    }


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

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity bookEntity = (BookEntity) o;
        return Objects.equals(getIsbn(), bookEntity.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn());
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
