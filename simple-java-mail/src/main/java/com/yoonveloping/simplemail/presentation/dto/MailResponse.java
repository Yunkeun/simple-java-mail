package com.yoonveloping.simplemail.presentation.dto;

import com.yoonveloping.simplemail.domain.Mail;

public class MailResponse {

    private Long id;
    private String address;
    private Boolean isAuth;
    private String time;

    public MailResponse() {
    }

    public MailResponse(Long id, String address, Boolean isAuth, String time) {
        this.id = id;
        this.address = address;
        this.isAuth = isAuth;
        this.time = time;
    }

    public static MailResponse of(Mail mail) {
        return new MailResponse(mail.getId(), mail.getAddress(), mail.getAuth(), mail.getTime());
    }

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getAuth() {
        return isAuth;
    }

    public String getTime() {
        return time;
    }
}
