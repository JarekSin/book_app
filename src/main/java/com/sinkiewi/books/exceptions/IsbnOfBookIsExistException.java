package com.sinkiewi.books.exceptions;

import com.sinkiewi.books.enums.AuthenticationMessageEnum;


public class IsbnOfBookIsExistException extends RuntimeException {

    public IsbnOfBookIsExistException() {
        super(AuthenticationMessageEnum.ISBN_IS_EXIST.getMessage());

    }
}
