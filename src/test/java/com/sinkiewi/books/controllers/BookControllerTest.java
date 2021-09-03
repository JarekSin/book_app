package com.sinkiewi.books.controllers;


import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.mock;

public class BookControllerTest {
//
//    @Test
//    public void shouldGetBooks() {
//
//        //given
//        BookController bookController = mock(BookController.class);
//        when(bookController.getBooks()).thenReturn(prepareMockDate());
//        //when
//        List<Book> books = bookController.getBooks();
//        //then
//        Assert.assertThat(bookController.getBooks(), hasSize(2));
//    }
//
//    private List<Book> prepareMockDate() {
//        List<Book> books = new ArrayList<>();
//        books.add(new Book(1L, "Java", "1234-1234-12345"));
//        books.add(new Book(2L, "Spring Boot", "2442-1434-12422"));
//        return books;
//    }
//
//    @Test
//    public void shouldAddBook() {
//
//        //given
//        BookController bookController = mock(BookController.class);
//        Mockito.when(bookController.addBook(Mockito.any(Book.class)))
//                .thenReturn(new Book(1L, "Java", "1234=1234=12345"));
//
//        final Book book = bookController.addBook(new Book());
//
//        Assert.assertEquals(book.getTitle(),"Java");
//        Assert.assertEquals(book.getIsbn(),"1234=1234=12345");
//    }
}