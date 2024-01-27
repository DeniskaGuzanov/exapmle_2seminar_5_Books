package com.example.exapmle_2seminar_5.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = true)
    private Integer publicationYear;

}
