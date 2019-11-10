package edu.kea.kh.goatsite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //private Long goatLiker;

    //private Long goatLiked;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "goat_liker_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Goat goatLiker;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "goat_liked_id", nullable = false)
    @JsonIgnore
    private Goat goatLiked;
}
