package stud.kea.dk.projekt3_gruppe_4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class madController {

    @GetMapping("/madspild")
    public String stop(){
        return "Madspild";
    }


    @GetMapping("/")
    public String StopMadSpild(){
        return "stopMadspild";
    }
    @GetMapping("/about")
    public String about() {
        return "About";
    }
}
