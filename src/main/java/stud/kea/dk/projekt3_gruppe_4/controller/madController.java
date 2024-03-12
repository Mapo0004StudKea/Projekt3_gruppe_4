package stud.kea.dk.projekt3_gruppe_4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class madController {

    @GetMapping("/Madspild")
    public String stop(){
        return "Madspild";
    }


    @GetMapping("/")
    public String StopMadSpild(){
        return "stopMadspild";
    }
    @PostMapping("/redirect")

    public String redirectToPage(@RequestParam("redirectPage") String redirectPage) {
        return "redirect:/" + redirectPage;
    }

    @GetMapping("/about")
    public String about() {
        return "About";
    }
}
