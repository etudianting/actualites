package com.actualites.dao;

import com.actualites.entities.Operation;
import com.actualites.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {
}
