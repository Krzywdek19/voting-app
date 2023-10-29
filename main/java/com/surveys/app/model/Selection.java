package com.surveys.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "selection")
public class Selection {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @NotNull
    private String content;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    private int votes = 0;
}
