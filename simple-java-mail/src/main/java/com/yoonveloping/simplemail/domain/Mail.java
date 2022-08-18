package com.yoonveloping.simplemail.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Entity
public class Mail {


    private static final int CODE_SIZE = 6;

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String address;
    @Column
    private Boolean isAuth;
    @Column
    private String time;

    public Mail(String address) {
        this.address = address;
        this.isAuth = false;
        this.time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public Mail() {
    }

    public String makeRandomCode() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        while (builder.length() < CODE_SIZE) {
            builder.append(random.nextInt(10));
        }
        return builder.toString();
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

    public void setMailTrue() {
        this.isAuth = true;
    }
}
