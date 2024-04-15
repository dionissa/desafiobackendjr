package com.dionissa.desafiobackendjr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dionissa.desafiobackendjr.core.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
