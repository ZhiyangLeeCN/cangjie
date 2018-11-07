package org.zhiyang.cangjie.entities;

public class ErrorType {

    private int status;

    private String message;

    public ErrorType(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
