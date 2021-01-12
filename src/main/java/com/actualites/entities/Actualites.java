package com.actualites.entities;


import com.actualites.embedded.Photo;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
public class Actualites {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Act;
    @NotBlank
    @Size(max = 150)
    @Column(name = "titre")
    private String titre;
    @NotBlank
    @Column(name = "description")
    private String description;
    @NotBlank
    private Date datePub;

    @NotBlank
    @Size(max = 50)
    private String urgent;

    @NotBlank
    @Size(max = 50)
    private String origine;

    @Column
    @Embedded
    private Photo photo;


}
