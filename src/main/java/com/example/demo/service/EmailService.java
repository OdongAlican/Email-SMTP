package com.example.demo.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmailService {

    @Autowired
    private JavaMailSenderImpl mailSender;

    public String sendEmails(MultipartFile[] attachments) {
        for (MultipartFile attachment : attachments) {
            String fileName = attachment.getOriginalFilename();
            String[] recipients = getRecipientsByFileName(fileName);

            if (recipients != null) {
                try {
                    MimeMessage message = mailSender.createMimeMessage();
                    MimeMessageHelper helper = new MimeMessageHelper(message, true);

                    helper.setFrom("contact@pridemicrofinance.co.ug");
                    helper.setTo(recipients);
                    helper.setSubject("Notification");
                    helper.setText("Pride Notification");

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

    private String[] getRecipientsByFileName(String fileName) {
        Map<String, String[]> fileRecipientsMap = new HashMap<>();
        fileRecipientsMap.put("Head_Office_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Central_1_Region_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Central_2_Region_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Central_3_Region_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Central_4_Region_data", new String[]{"sandieo.2020@gmail.com"});
//        fileRecipientsMap.put("Northern_Region_data", new String[]{"sunday.odong@coseke.com", "dkatamba@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Northern_Region_data", new String[]{"sunday.odong@coseke.com"});
        fileRecipientsMap.put("Eastern_Region_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Western_1_Region_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Western_2_Region_data", new String[]{"sandieo.2020@gmail.com"});


//        "jaogon@pridemicrofinance.co.ug"

        return fileRecipientsMap.get(fileName);
    }
}
