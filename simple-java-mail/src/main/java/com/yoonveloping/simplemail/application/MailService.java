package com.yoonveloping.simplemail.application;

import com.yoonveloping.simplemail.domain.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private final JavaMailSender mailSender;

    @Autowired(required = false)
    public MailService(JavaMailSenderImpl mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(String address) {
        Mail mail = new Mail(address);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mail.getAddress());
        message.setSubject("[Test] 메일 계정 인증");
        message.setText("code: " + mail.getRandomCode());
        mailSender.send(message);
    }
}
