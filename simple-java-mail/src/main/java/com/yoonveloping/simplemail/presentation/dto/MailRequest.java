package com.yoonveloping.simplemail.presentation.dto;

public class MailRequest {

    private String address;

    public MailRequest() {
    }

    public MailRequest(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
