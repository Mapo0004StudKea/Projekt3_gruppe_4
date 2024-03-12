package stud.kea.dk.projekt3_gruppe_4.controller;

import org.springframework.stereotype.Controller;

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
