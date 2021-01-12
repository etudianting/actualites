package com.actualites.dao;

import com.actualites.entities.Domaine;
import com.actualites.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DomaineRepository extends JpaRepository<Domaine, Long> {
}
