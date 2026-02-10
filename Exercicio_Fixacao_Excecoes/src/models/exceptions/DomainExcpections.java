package models.exceptions;

public class DomainExcpections extends RuntimeException {
    public DomainExcpections() {
    }

    public DomainExcpections(String message) {
        super(message);
    }

    public DomainExcpections(String message, Throwable cause) {
        super(message, cause);
    }

    public DomainExcpections(Throwable cause) {
        super(cause);
    }

    public DomainExcpections(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
