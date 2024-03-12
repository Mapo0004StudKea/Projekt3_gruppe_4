package stud.kea.dk.projekt3_gruppe_4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import stud.kea.dk.projekt3_gruppe_4.model.ContactData;
import stud.kea.dk.projekt3_gruppe_4.repository.ContactRepository;
import stud.kea.dk.projekt3_gruppe_4.service.ContactService;

import java.util.List;

@Controller
public class ContactController {
    @Autowired
    ContactRepository contactRepository;

    @Autowired
    ContactService contactService;
    @GetMapping("/kontakt")
    public String contact(Model model) {
        List<ContactData> contactDataList = contactRepository.getAllContactData();
        model.addAttribute("contactlist", contactDataList);
        return "Contact";
    }

}
