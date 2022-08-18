package com.yoonveloping.simplemail.presentation;

import com.yoonveloping.simplemail.application.MailService;
import com.yoonveloping.simplemail.presentation.dto.MailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/mail")
public class MailController {

    private final MailService mailService;

    @Autowired
    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/send")
    public ResponseEntity<HttpStatus> send(@RequestBody MailRequest request) {
        mailService.sendMail(request.getAddress());
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

}
