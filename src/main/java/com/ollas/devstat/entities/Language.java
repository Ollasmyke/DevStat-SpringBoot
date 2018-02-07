package com.ollas.devstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "language_id")
    private Integer ticketId;

    @Column(name = "languages")
    private String languages;
}


