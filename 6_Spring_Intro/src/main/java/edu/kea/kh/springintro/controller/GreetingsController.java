package edu.kea.kh.springintro.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingsController {

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public String greetings(@RequestParam(value = "name", required = false) String name) {
        if (name ==null) {
            return "What is your name?";
        } else {
            return "hello " + name;

        }
    }
    // How to send data with get, Pathvariable / Requestvariable
    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String bab() {
        return "About Info: Greetings API - Version 1.9.6";
    }



    // PersonID -> Pathvariable
    @RequestMapping(value = "/greetings/{personId}" , method = RequestMethod.GET)
    public String mingleWithPerson(@PathVariable Integer personId ) {
        System.out.println(personId);
        switch (personId) {

            case 0:
            return "Johannes";

            case 1:
            return "K";

            case 2:
            return "J";

            case 3:
            return "M";

            default:
            return "Latiff - Anders";

            //    return "K";

        }
    }

    @RequestMapping (value= "/body", method = RequestMethod.POST)
    public String showMeTheBody(@RequestBody String body) {
        return body;
        //return "mmmh I like your body";

    }

}
