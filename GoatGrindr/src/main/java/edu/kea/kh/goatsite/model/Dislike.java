package edu.kea.kh.goatsite.model;

import javax.persistence.*;

@Entity
@Table(name = "dislikes")
public class Dislike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    //private Long goatDisliker;

    //private Long goatDisliked;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "goat_disliked", nullable = false)
    private Goat goat_disliked;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "goat_disliker", nullable = false)
    private Goat goat_disliker;

}

