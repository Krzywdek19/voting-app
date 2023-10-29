package com.surveys.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NotNull
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String email;

    @NotNull
    private String name;

    @NotNull
    private String lastname;

    @NotNull
    private String password;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Survey> surveys = new HashSet<>();
}
