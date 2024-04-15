package com.dionissa.desafiobackendjr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dionissa.desafiobackendjr.core.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
