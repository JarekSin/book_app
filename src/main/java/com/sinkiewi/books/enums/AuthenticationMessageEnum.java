package com.sinkiewi.books.enums;

public enum AuthenticationMessageEnum {

    ISBN_IS_EXIST("isbn of book is exist");

    private final String message;

    AuthenticationMessageEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
