package edu.kea.kh.goatsite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "goat_disliker_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Goat goatDisliker;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "goat_disliked_id", nullable = false)
    @JsonIgnore
    private Goat goatDisLiked;

}

