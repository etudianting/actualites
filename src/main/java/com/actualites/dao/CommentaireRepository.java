package com.actualites.dao;

import com.actualites.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
}
