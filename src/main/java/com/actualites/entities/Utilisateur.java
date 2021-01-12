package com.actualites.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "utilisateur")
public class Utilisateur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @Size(max = 50)
    @Column(name = "firstname")
    private String firstName;
    @NotBlank
    @Size(max = 50)
    @Column(name = "lastname")
    private String lastName;
    @NotBlank
    @Size(max = 50)
    private String password;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    private int tel;

    @Size(max = 120)
    private String role;
    @ManyToMany( fetch = FetchType.LAZY)
    private Set<Role> roles = new HashSet<>();













}
