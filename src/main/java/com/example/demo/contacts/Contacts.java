package com.example.demo.contacts;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.utils.Constants.TEST_USER_EMAIL;

@Component
@Data
public class Contacts {

//    public String[] getRecipientsByFileName(String fileName) {
//        Map<String, String[]> fileRecipientsMap = new HashMap<>();
//        fileRecipientsMap.put("Mukono_data", new String[]{"mukono@pridemicrofinance.co.ug", "dkatamba@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Head_Office_data", new String[]{"bukoto@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("City_Centre_data", new String[]{"citycentre@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Katwe_data", new String[]{"katwe@pridemicrofinance.co.ug", "dkatamba@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Bukoto_data", new String[]{"bukoto@pridemicrofinance.co.ug", "vkiyingi@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Kayunga_data", new String[]{"mukono@pridemicrofinance.co.ug", "sodong@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Abayita_Ababiri_data", new String[]{"AbayitaAbabiri@pridemicrofinance.co.ug", "vnamagembe@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Hoima_data", new String[]{"hoima@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Wandegeya_data", new String[]{"wandegeyastaff@pridemicrofinance.co.ug", "vnamagembe@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Kawempe_data", new String[]{"kawempe@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Kagadi_data", new String[]{"KagadiStaff@pridemicrofinance.co.ug", "dkatamba@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Masindi_data", new String[]{"hoima@pridemicrofinance.co.ug", "jaogon@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Nakawa_data", new String[]{"nakawa@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Arua_data", new String[]{"arua@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Nansana_data", new String[]{"Nansanastaff@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Kabalagala_data", new String[]{"kabalagala@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Kyaliwajjala_data", new String[]{"KyaliwajjalaStaff@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Jinja_data", new String[]{"jinja@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Iganga_data", new String[]{"iganga@pridemicrofinance.co.ug", "dkatamba@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Buwenge_data", new String[]{"buwege@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Bugiri_data", new String[]{"bugiri@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Lugazi_data", new String[]{"lugazi@pridemicrofinance.co.ug", "vkiyingi@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Kamuli_data", new String[]{"kamuli@pridemicrofinance.co.ug", "jaogon@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Namayingo_data", new String[]{"pml@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Mbale_data", new String[]{"mbale@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Lira_data", new String[]{"lira@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Soroti_data", new String[]{"sorotistaff@pridemicrofinance.co.ug", "dkatamba@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Gulu_data", new String[]{"gulu@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Pader_data", new String[]{"paderstaff@pridemicrofinance.co.ug", "sodong@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Bweyale_data", new String[]{"bweyalestaff@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Mbarara_data", new String[]{"mbarara@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Rukungiri_data", new String[]{"rukungiristaff@pridemicrofinance.co.ug", "jaogon@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Kabale_data", new String[]{"kabale@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Ibanda_data", new String[]{"Ibandabranch@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Isingiro_data", new String[]{"isingiro@pridemicrofinance.co.ug", "vnamagembe@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Kisoro_data", new String[]{"kisoro@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Kasese_data", new String[]{"kasese@pridemicrofinance.co.ug", "sodong@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Ishaka_data", new String[]{"ishaka@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Fort_Portal_data", new String[]{"fortportal@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Bushenyi_data", new String[]{"bushenyi@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Kabwohe_data", new String[]{"kabwohe@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Masaka_data", new String[]{"masaka@pridemicrofinance.co.ug", "jaogon@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Nateete_data", new String[]{"nateetestaff@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Entebbe_Road_data", new String[]{"entebberoad@pridemicrofinance.co.ug", "vkiyingi@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Nakulabye_data", new String[]{"nakulabye@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Bweyogerere_data", new String[]{"bweyogerere@pridemicrofinance.co.ug"});
//        fileRecipientsMap.put("Gayaza_data", new String[]{"gayaza@pridemicrofinance.co.ug"});
//        return fileRecipientsMap.get(fileName);
//    }

    public String[] getTestRecipientsByFileName(String fileName) {
        Map<String, String[]> fileRecipientsMap = new HashMap<>();

        fileRecipientsMap.put("Mukono_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Head_Office_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("City_Centre_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Katwe_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Bukoto_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Kayunga_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Abayita_Ababiri_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Hoima_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Wandegeya_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Kawempe_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Kagadi_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Masindi_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Nakawa_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Arua_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Nansana_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Kabalagala_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Kyaliwajjala_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Jinja_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Iganga_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Buwenge_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Bugiri_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Lugazi_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Kamuli_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Namayingo_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Mbale_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Lira_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Soroti_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Gulu_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Pader_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Bweyale_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Mbarara_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Rukungiri_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Kabale_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Ibanda_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Isingiro_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Kisoro_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Kasese_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Ishaka_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Fort_Portal_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Bushenyi_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Kabwohe_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Masaka_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Nateete_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Entebbe_Road_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Nakulabye_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Bweyogerere_data", new String[]{TEST_USER_EMAIL});
        fileRecipientsMap.put("Gayaza_data", new String[]{TEST_USER_EMAIL});
        return fileRecipientsMap.get(fileName);
    }
}
