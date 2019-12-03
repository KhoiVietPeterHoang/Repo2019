package edu.kea.kh.goatsite.repository;

import edu.kea.kh.goatsite.model.Dislike;
import edu.kea.kh.goatsite.model.Like;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DislikeRepository extends CrudRepository<Dislike, Long> {

    Iterable<Like> filterGoatsbydisLikes(long goat_dislikes);

    Iterable<Like> filterGoatsbydisLiked(long goat_disliked);

}
