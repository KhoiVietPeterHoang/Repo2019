package edu.kea.kh.goatsite.repository;

import edu.kea.kh.goatsite.model.Gender;
import edu.kea.kh.goatsite.model.Goat;
import edu.kea.kh.goatsite.model.Goat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface GoatRepository extends CrudRepository<Goat, Long> {

    Iterable<Goat> findGoatByName(String name);
    Iterable<Goat> findGoatByGender(Gender gender);
    Iterable<Goat> findAllByName(String name);
    Goat findFirstByName(String name);

    @Query(value = "SELECT * FROM Goats z WHERE z.id <= 2", nativeQuery = true)
        Iterable<Goat> findTheOldTimers();



    }
