package edu.kea.kh.goatsite.controller.api;

import edu.kea.kh.goatsite.model.Like;
import edu.kea.kh.goatsite.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class LikeApiController {

   @Autowired
   private LikeRepository likerepository;

    @GetMapping("/like/likes")
   // public Iterable<Like> thisGoatLikes(@PathVariable long id){
    public Iterable<Like> allLikes(){
        return likerepository.findAll();

    }

    @GetMapping("/like/likes/{id}")
    public Object thisGoatLikes(@PathVariable long id){
        return likerepository.findById(id);
    }






    //@GetMapping("/like/liked")

    //This goat likes X goat, X goat is liked by this goat


}


