package edu.kea.kh.goatsite.controller.api;

import edu.kea.kh.goatsite.repository.DislikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DislikeApiController {

    @Autowired
    private DislikeRepository dislikeRepository;


    //@GetMapping("/like/dislike")

    //@GetMapping("/like/disliked")


    //This goat dislikes X goat, X goat is disliked by this goat


}
