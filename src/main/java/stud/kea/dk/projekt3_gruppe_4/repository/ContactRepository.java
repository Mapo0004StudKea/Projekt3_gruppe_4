package stud.kea.dk.projekt3_gruppe_4.repository;

import org.springframework.stereotype.Repository;
import stud.kea.dk.projekt3_gruppe_4.model.ContactData;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContactRepository {
    public List<ContactData> getAllContactData() {
        List<ContactData> contactDataList = new ArrayList<>();
        contactDataList.add(new ContactData(1, "Sebastian", " Drumm", "sedr0001@stud.kea.dk", "https://github.com/drummdurum"));
        contactDataList.add(new ContactData(2, "Viktor", "Rasmussen", "vira0004@stud.kea.dk", "https://github.com/Viggo2102"));
        contactDataList.add(new ContactData(3, "Viggo", "Beck", "vibe0002@stud.kea.dk", "https://github.com/ViggoBeck"));
        contactDataList.add(new ContactData(4, "Martin", "Poulsen", "mapo0004@stud.kea.dk", "https://github.com/Mapo0004StudKea/Projekt3_gruppe_4"));
        return contactDataList;
    }
}
