package stud.kea.dk.projekt3_gruppe_4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class madController {

    @GetMapping("/")
    public String stop(){
        return "Madspild";
    }

}
