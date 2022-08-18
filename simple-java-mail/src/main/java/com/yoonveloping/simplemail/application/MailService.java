package com.yoonveloping.simplemail.application;

import com.yoonveloping.simplemail.domain.Mail;
import com.yoonveloping.simplemail.domain.respository.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private final JavaMailSender mailSender;
    private final MailRepository mailRepository;

    @Autowired(required = false)
    public MailService(JavaMailSenderImpl mailSender, MailRepository mailRepository) {
        this.mailSender = mailSender;
        this.mailRepository = mailRepository;
    }

    public void sendMail(String address) {
        Mail mail = new Mail(address);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mail.getAddress());
        message.setSubject("[Test] 메일 계정 인증");
        message.setText("code: " + mail.makeRandomCode());
        mail.setMailTrue();
        mailRepository.save(mail);
        mailSender.send(message);
    }

    public Mail getMail() {
        return mailRepository.findMailById(1L);
    }
}
