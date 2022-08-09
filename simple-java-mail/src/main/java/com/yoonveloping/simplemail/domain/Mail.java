package com.yoonveloping.simplemail.domain;

import java.util.Random;

public class Mail {

    private static final int CODE_SIZE = 6;

    private final String address;
    private final String randomCode;
    private Boolean isAuth;

    public Mail(String address) {
        this.address = address;
        this.randomCode = makeRandomCode();
        this.isAuth = false;
    }

    private String makeRandomCode() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        while (builder.length() < CODE_SIZE) {
            builder.append(random.nextInt(10));
        }
        return builder.toString();
    }

    public void setMailTrue() {
        this.isAuth = true;
    }

    public String getAddress() {
        return address;
    }

    public String getRandomCode() {
        return randomCode;
    }

    public Boolean getAuth() {
        return isAuth;
    }
}
