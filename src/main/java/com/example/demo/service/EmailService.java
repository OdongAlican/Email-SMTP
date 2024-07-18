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
        fileRecipientsMap.put("Mukono_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Head_Office_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("City_Centre_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Katwe_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Bukoto_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Kayunga_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Abayita_Ababiri_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Hoima_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Wandegeya_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Kawempe_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Kagadi_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Masindi_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Nakawa_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Arua_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Nansana_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Kabalagala_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Kyaliwajjala_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Jinja_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Iganga_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Buwenge_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Bugiri_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Lugazi_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Kamuli_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Namayingo_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Mbale_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Lira_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Soroti_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Gulu_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Pader_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Bweyale_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Mbarara_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Rukungiri_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Kabale_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Ibanda_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Isingiro_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Kisoro_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Kasese_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Ishaka_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Fort_Portal_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Bushenyi_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Kabwohe_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Masaka_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Nateete_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Entebbe_Road_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Nakulabye_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Bweyogerere_data", new String[]{"sandieo.2020@gmail.com"});
        fileRecipientsMap.put("Gayaza_data", new String[]{"sandieo.2020@gmail.com"});
//        fileRecipientsMap.put("Northern_Region_data", new String[]{"sunday.odong@coseke.com", "dkatamba@pridemicrofinance.co.ug"});


//        "jaogon@pridemicrofinance.co.ug"

        return fileRecipientsMap.get(fileName);
    }
}
