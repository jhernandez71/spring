package com.example.ob_spring_ejercicio4_5_6.repository;

import com.example.ob_spring_ejercicio4_5_6.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
