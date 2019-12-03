package edu.kea.kh.goatsite.Integrationtest;

import edu.kea.kh.goatsite.model.Goat;
import edu.kea.kh.goatsite.repository.GoatRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class GoatRepositoryIntegrationTests {

    @Autowired
    GoatRepository goatRepository;

    @Test
    public void CanWeGetAllGoats(){
      Iterable<Goat> goats =  goatRepository.findAll();
    }

    @Test
    public void canWeCreateAndGetGoat() {
        Goat goat = new Goat();
        goat.setName("Scoop");
        goat.setDob(new Date());

        goatRepository.save(goat);
        Goat find = goatRepository.findFirstByName(goat.getName());

        assertThat(find.getName()).isEqualTo("Scoop");

    }

}
