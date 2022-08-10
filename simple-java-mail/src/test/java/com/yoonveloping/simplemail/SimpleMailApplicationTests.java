package com.yoonveloping.simplemail;

import com.yoonveloping.simplemail.application.MailService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootTest
class SimpleMailApplicationTests {

	@Autowired
	private final MailService mailService = new MailService(new JavaMailSenderImpl());

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("메일 자동 코드 생성 테스트")
	void mailCodeTest() {
		String address = "32174294@dankook.ac.kr";
		mailService.sendMail(address);
	}

}
