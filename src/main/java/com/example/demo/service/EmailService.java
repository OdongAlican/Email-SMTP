package com.example.demo.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Objects;

@Service
public class EmailService {

    @Autowired
    private JavaMailSenderImpl mailSender;

    public String sendEmails(
            String[] to,
            String subject,
            String body,
            MultipartFile attachment
    ) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setFrom("contact@pridemicrofinance.co.ug");
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(body);

            helper.addAttachment(Objects.requireNonNull(attachment.getOriginalFilename()), attachment);

            mailSender.send(message);
            return "Message Sent";
        } catch (MessagingException e) {
            return "Error while sending message";
        }
    }
}
