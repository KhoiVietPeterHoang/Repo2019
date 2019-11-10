package edu.kea.kh.goatsite.controller.api;

import edu.kea.kh.goatsite.model.Gender;
import edu.kea.kh.goatsite.model.Goat;
import edu.kea.kh.goatsite.repository.GoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class GoatApiController {

    @Autowired
    private GoatRepository goatRepository;

    @GetMapping("/goats")
    public Iterable<Goat> getGoats() {
        return goatRepository.findAll();
    }

    @GetMapping("/goats/{id}")
    public Object getGoatById(@PathVariable long id) {
        //public Goat getGoatById(@PathVariable long id) {
        Optional goatOrNull = goatRepository.findById(id);
        if (goatOrNull.isPresent()) {
            return goatOrNull.get();
        } else {
            return "404 - Code not found";

        }

        // return goatRepository.findById(id).orElse(null);

    }

    @GetMapping("/goats/findbyname")
        public Iterable<Goat> getGoatByName(@RequestParam(value = "name")String name) {     // ?name=______
            return goatRepository.findGoatByName(name);
           // return goatRepository.findFirstByName(name);

    }

    @GetMapping("/goats/findbygender")
        public Iterable<Goat> getGoatByGender(@RequestParam(value = "gender") Gender gender) {   // ?gender=____
        return goatRepository.findGoatByGender(gender);
    }

    @GetMapping("/goats/oldtimers")
        public Iterable<Goat> getOldTimers(){
        return goatRepository.findTheOldTimers();
    }

    @PostMapping("/goats")
    public Goat createGoat(@Valid @RequestBody Goat goat) {
        //goat.setName("Zil");
        return goatRepository.save(goat);
    }

}
