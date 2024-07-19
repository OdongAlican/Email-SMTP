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
                    helper.setSubject("Loans Disbursed for " + removeDataSuffix(fileName) + " Branch on 17th July 2024");
                    helper.setText("Please find the attached Loans Disbursed for " + removeDataSuffix(fileName) + " Branch on 17th July 2024");

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

    private String[] getRecipientsByFileName(String fileName) {
        Map<String, String[]> fileRecipientsMap = new HashMap<>();
        fileRecipientsMap.put("Mukono_data", new String[]{"mukono@pridemicrofinance.co.ug", "dkatamba@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Head_Office_data", new String[]{"bukoto@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("City_Centre_data", new String[]{"citycentre@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Katwe_data", new String[]{"katwe@pridemicrofinance.co.ug", "dkatamba@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Bukoto_data", new String[]{"bukoto@pridemicrofinance.co.ug", "vkiyingi@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Kayunga_data", new String[]{"mukono@pridemicrofinance.co.ug", "sodong@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Abayita_Ababiri_data", new String[]{"AbayitaAbabiri@pridemicrofinance.co.ug", "vnamagembe@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Hoima_data", new String[]{"hoima@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Wandegeya_data", new String[]{"wandegeyastaff@pridemicrofinance.co.ug", "vnamagembe@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Kawempe_data", new String[]{"kawempe@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Kagadi_data", new String[]{"KagadiStaff@pridemicrofinance.co.ug", "dkatamba@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Masindi_data", new String[]{"hoima@pridemicrofinance.co.ug", "jaogon@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Nakawa_data", new String[]{"nakawa@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Arua_data", new String[]{"arua@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Nansana_data", new String[]{"Nansanastaff@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Kabalagala_data", new String[]{"kabalagala@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Kyaliwajjala_data", new String[]{"KyaliwajjalaStaff@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Jinja_data", new String[]{"jinja@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Iganga_data", new String[]{"iganga@pridemicrofinance.co.ug", "dkatamba@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Buwenge_data", new String[]{"buwege@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Bugiri_data", new String[]{"bugiri@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Lugazi_data", new String[]{"lugazi@pridemicrofinance.co.ug", "vkiyingi@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Kamuli_data", new String[]{"kamuli@pridemicrofinance.co.ug", "jaogon@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Namayingo_data", new String[]{"pml@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Mbale_data", new String[]{"mbale@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Lira_data", new String[]{"lira@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Soroti_data", new String[]{"sorotistaff@pridemicrofinance.co.ug", "dkatamba@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Gulu_data", new String[]{"gulu@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Pader_data", new String[]{"paderstaff@pridemicrofinance.co.ug", "sodong@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Bweyale_data", new String[]{"bweyalestaff@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Mbarara_data", new String[]{"mbarara@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Rukungiri_data", new String[]{"rukungiristaff@pridemicrofinance.co.ug", "jaogon@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Kabale_data", new String[]{"kabale@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Ibanda_data", new String[]{"Ibandabranch@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Isingiro_data", new String[]{"isingiro@pridemicrofinance.co.ug", "vnamagembe@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Kisoro_data", new String[]{"kisoro@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Kasese_data", new String[]{"kasese@pridemicrofinance.co.ug", "sodong@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Ishaka_data", new String[]{"ishaka@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Fort_Portal_data", new String[]{"fortportal@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Bushenyi_data", new String[]{"bushenyi@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Kabwohe_data", new String[]{"kabwohe@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Masaka_data", new String[]{"masaka@pridemicrofinance.co.ug", "jaogon@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Nateete_data", new String[]{"nateetestaff@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Entebbe_Road_data", new String[]{"entebberoad@pridemicrofinance.co.ug", "vkiyingi@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Nakulabye_data", new String[]{"nakulabye@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Bweyogerere_data", new String[]{"bweyogerere@pridemicrofinance.co.ug"});
        fileRecipientsMap.put("Gayaza_data", new String[]{"gayaza@pridemicrofinance.co.ug"});
        return fileRecipientsMap.get(fileName);
    }
}
