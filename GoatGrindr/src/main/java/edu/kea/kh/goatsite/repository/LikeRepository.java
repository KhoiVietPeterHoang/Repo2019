package edu.kea.kh.goatsite.repository;

import edu.kea.kh.goatsite.model.Like;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends CrudRepository<Like, Long > {

    Iterable<Like> filterGoatsbyLikes(long goat_likes);

    Iterable<Like> filterGoatsbyLiked(long goat_liked);

}
