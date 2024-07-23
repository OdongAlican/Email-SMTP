package com.example.demo.service;

import com.example.demo.contacts.Contacts;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EmailService {

    @Autowired
    private JavaMailSenderImpl mailSender;

    @Autowired
    private Contacts contacts;

    public String sendEmails(MultipartFile[] attachments) {
        for (MultipartFile attachment : attachments) {
            String fileName = attachment.getOriginalFilename();
            String[] recipients = contacts.getTestRecipientsByFileName(fileName);

            if (recipients != null) {
                try {
                    MimeMessage message = mailSender.createMimeMessage();
                    MimeMessageHelper helper = new MimeMessageHelper(message, true);
                    helper.setFrom("contact@pridemicrofinance.co.ug");
                    helper.setTo(recipients);
                    helper.setSubject("Branch Report for " + removeDataSuffix(fileName) + " Branch on 22nd July 2024");
                    helper.setText("Please find the attached Branch Report for " + removeDataSuffix(fileName) + " Branch on 22nd July 2024");

                    helper.addAttachment(attachment.getOriginalFilename() + ".pdf", attachment);

                    mailSender.send(message);
                    System.out.println("Message Sent to: " + String.join(", ", recipients));
                } catch (MessagingException e) {
                    System.err.println("Error while sending message: " + e.getMessage());
                    return "Error while sending message";
                }
            } else {
                System.err.println("No recipients found for file: " + fileName);
                return "No recipients found for some files";
            }
        }
        return "Messages Sent";
    }

    private static String removeDataSuffix(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] parts = input.split("_");
        return parts[0];
    }

    public String sendReports(MultipartFile[] files) {
        return null;
    }
}
