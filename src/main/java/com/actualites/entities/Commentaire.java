package com.actualites.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commentaire {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommentaire ;
    private String typeOperation  ;


}
