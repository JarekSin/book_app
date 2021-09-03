package com.sinkiewi.books.mappers;

import com.sinkiewi.books.builders.BookDtoBuilder;
import com.sinkiewi.books.builders.BookEntityBuilder;
import com.sinkiewi.books.repositories.entities.BookEntity;
import com.sinkiewi.books.services.dtos.BookDto;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BooksMapper {

    public BookEntity fromDtoToEntity(BookDto dto) {
        if (Objects.isNull(dto)) {
            return null;
        }
        var entityBuilder = new BookEntityBuilder();

        if (Objects.nonNull(dto.getId())) {
            entityBuilder.withId(dto.getId());
        }
        if (Objects.nonNull(dto.getTitle())) {
            entityBuilder.withTitle(dto.getTitle());
        }
        if (Objects.nonNull(dto.getIsbn())) {
            entityBuilder.withIsbn(dto.getIsbn());
        }

        if (Objects.nonNull(dto.getCategory())) {
            entityBuilder.withCategory(dto.getCategory());
        }
        return entityBuilder.build();
    }

    public BookDto fromEntityToDto(BookEntity entity) {
        if (Objects.isNull(entity)) {
            return null;
        }
        var dtoBuilder = new BookDtoBuilder();

        if (Objects.nonNull(entity.getId())) {
            dtoBuilder.withId(entity.getId());
        }
        if (Objects.nonNull(entity.getTitle())) {
            dtoBuilder.withTitle(entity.getTitle());
        }
        if(Objects.nonNull(entity.getId())) {
            dtoBuilder.withIsbn(entity.getIsbn());
        }

        if (Objects.nonNull(entity.getCategory())) {
            dtoBuilder.withCategory(entity.getCategory());
        }
        return dtoBuilder.build();
    }
}
