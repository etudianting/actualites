package com.actualites.dao;

import com.actualites.entities.Publicite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PubliciteRepository extends JpaRepository<Publicite, Long> {
}
