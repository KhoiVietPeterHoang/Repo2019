package edu.kea.kh.goatsite.model;

import javax.persistence.*;

@Entity
@Table(name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long goat1Id;

    private Long goat2Id;
}
