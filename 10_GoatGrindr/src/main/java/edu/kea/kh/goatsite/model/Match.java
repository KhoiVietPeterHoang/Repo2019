package edu.kea.kh.goatsite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "goat_matcher_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Goat goatMatched;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "goat_unmatcher_id", nullable = false)
    @JsonIgnore
    private Goat goatNotMatched;
}
