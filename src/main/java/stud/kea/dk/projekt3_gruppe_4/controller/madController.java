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
        return "StopMadSpild";
    }
    @PostMapping("/redirect")

    public String redirectToPage(@RequestParam("redirectPage") String redirectPage) {
        return "redirect:/" + redirectPage;
    }

    @GetMapping("/Forbruger")
    public String forbruger() {
        return "Forbruger";
    }

    @GetMapping("Virksomhed")
    public String virksomhed() {
        return "Virksomhed";
    }

    @GetMapping("/about")
    public String about() {
        return "About";
    }
}

