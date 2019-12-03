package edu.kea.kh.goatsite.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "goats")
public class Goat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @NotNull
    @Past
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dob;

    @Length(max = 120)
    private String shortDescription;

    @Length(max = 10000)
    private String longDescription;

    @Email(message = "Email should be valid")
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "goatLiker")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private List<Like> goatLikers;

    @OneToMany(mappedBy = "goatLiked")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private List<Like> goatLikeds;

    @OneToMany(mappedBy = "goatDisliker")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private List<Dislike> goatDislikers;

    @OneToMany(mappedBy = "goatDisliked")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private List<Dislike> goatDislikeds;

    @OneToMany(mappedBy = "goatMatched")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private List<Match> goatMatchers;

    @OneToMany(mappedBy = "goatNotMatched")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private List<Match> goatNotMatchers;

}
