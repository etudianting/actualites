package com.actualites.dao;

import com.actualites.entities.Actualites;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActualitesRepository extends JpaRepository<Actualites, Long> {
}
