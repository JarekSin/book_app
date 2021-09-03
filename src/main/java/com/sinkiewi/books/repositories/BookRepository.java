package com.sinkiewi.books.repositories;


import com.sinkiewi.books.repositories.entities.BookEntity;
import com.sinkiewi.books.services.dtos.BookDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

//    @Query("Select p From ")
   // List<BookDto> findAllBooks (Pageable pageable);

    Optional<BookEntity> findByIsbn(String isbn);
}


