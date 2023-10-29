package com.surveys.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "user_id")
    private User owner;

    @OneToMany
    @JoinTable(
            name = "votes",
            joinColumns =
            @JoinColumn(
                    name = "user_id"
            ),
            inverseJoinColumns =
            @JoinColumn(
                    name = "survey_id"
            )
    )
    private Set<User> voters = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
    private Set<Question> questions = new HashSet<>();
}
