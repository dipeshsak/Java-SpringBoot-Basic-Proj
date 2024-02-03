package com.springbootut1.springbootut1.error;

public class DepartmentNotFoundExeception extends Exception{

    public DepartmentNotFoundExeception() {
    }

    public DepartmentNotFoundExeception(String message) {
        super(message);
    }

    public DepartmentNotFoundExeception(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentNotFoundExeception(Throwable cause) {
        super(cause);
    }

    public DepartmentNotFoundExeception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
