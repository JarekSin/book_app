package com.sinkiewi.books;

import com.sinkiewi.books.enums.BookCategory;
import com.sinkiewi.books.repositories.BookRepository;
import com.sinkiewi.books.repositories.entities.BookEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.stream.IntStream;

@SpringBootApplication
@EnableSwagger2
public class BooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksApplication.class, args);
    }

    @Bean
    CommandLineRunner run(BookRepository bookRepository) {
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
                IntStream.rangeClosed(1, 2)
                        .forEach(i -> {
                            BookEntity bookEntity = new BookEntity();
                            bookEntity.setIsbn("1234-1234" + i);
                            bookEntity.setTitle("Java" + i);
                            bookEntity.setCategory(BookCategory.COMEDY);
                            bookRepository.save(bookEntity);

                        });
            }
        };
    }

}
