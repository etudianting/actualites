package com.actualites.entities;


import com.actualites.embedded.Photo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Publicite {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pub ;

    private String nompub;

    private String URL;

    private Photo fotos;

}
