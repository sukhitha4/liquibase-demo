package com.captains.util;

public class PostingException extends IllegalArgumentException {

    public PostingException() {
        super();
    }

    public PostingException(String s) {
        super(s);
    }

    public PostingException(String s, Throwable t) {
        super(s, t);
    }

}
