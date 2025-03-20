package com.rebellion.blogging_platform_api.entity;

import org.springframework.http.HttpStatus;

public class Status {
    private StatusEnum status;
    private HttpStatus code;
    private String message;

    public Status(StatusEnum status, HttpStatus code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public Status() {
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public HttpStatus getCode() {
        return code;
    }

    public void setErrorCode(HttpStatus code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
