package stud.kea.dk.projekt3_gruppe_4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class madController {

    @GetMapping("/hej")
    public String stop(){
        return "Madspild";
    }


    @GetMapping("/")
    public String StopMadSpild(){
        return "stopMadspild";
    }
    //hej med dig
}
