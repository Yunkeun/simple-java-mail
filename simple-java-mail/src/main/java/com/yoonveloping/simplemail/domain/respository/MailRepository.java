package com.yoonveloping.simplemail.domain.respository;

import com.yoonveloping.simplemail.domain.Mail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRepository extends JpaRepository<Mail, Long> {

    Mail findMailById(Long Long);
}
