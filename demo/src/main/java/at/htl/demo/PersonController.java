package at.htl.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping("/")
    String getPeople(Model model){
        model.addAttribute("something","this is from the Controller");
        return "people";
    }
}
