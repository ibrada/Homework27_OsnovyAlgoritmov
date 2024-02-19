package org.example.exception;

public class ArrIsFullException extends RuntimeException {
    public ArrIsFullException() {
    }

    public ArrIsFullException(String message) {
        super(message);
    }

    public ArrIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrIsFullException(Throwable cause) {
        super(cause);
    }

    public ArrIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
