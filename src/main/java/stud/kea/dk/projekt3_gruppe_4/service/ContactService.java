package stud.kea.dk.projekt3_gruppe_4.service;

import org.springframework.stereotype.Service;
import stud.kea.dk.projekt3_gruppe_4.model.ContactData;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactService {
    public List<ContactData> sortById(List<ContactData> contactDataList) {
        List<ContactData> sortedList = contactDataList.stream()
                .sorted(Comparator.comparing(ContactData::getId))
                .collect(Collectors.toList());
        return sortedList;
    }

    public List<ContactData> sortByName(List<ContactData> contactDataList) {
        List<ContactData> sortedList = contactDataList.stream()
                .sorted(Comparator.comparing(ContactData::getFirstName))
                .collect(Collectors.toList());
        return sortedList;
    }

    public List<ContactData> sortByLastName(List<ContactData> contactDataList) {
        List<ContactData> sortedList = contactDataList.stream()
                .sorted(Comparator.comparing(ContactData::getLastName))
                .collect(Collectors.toList());
        return sortedList;
    }

    public List<ContactData> sortByStudMail(List<ContactData> contactDataList) {
        List<ContactData> sortedList = contactDataList.stream()
                .sorted(Comparator.comparing(ContactData::getStudentMail))
                .collect(Collectors.toList());
        return sortedList;
    }

    public List<ContactData> sortByGithub(List<ContactData> contactDataList) {
        List<ContactData> sortedList = contactDataList.stream()
                .sorted(Comparator.comparing(ContactData::getGithubmail))
                .collect(Collectors.toList());
        return sortedList;
    }
}
