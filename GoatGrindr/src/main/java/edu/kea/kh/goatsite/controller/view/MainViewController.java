package edu.kea.kh.goatsite.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainViewController {

    @GetMapping(value = "/test")
    public String TestPath(Model model, @RequestParam(value = "name") String VisitorName){
        model.addAttribute("name", "VisitorName");
        return "test.html";
    }

}
