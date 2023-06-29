package com.example.BiletiniAl.repository;

import com.example.BiletiniAl.entities.Bilet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiletRepository extends JpaRepository<Bilet, Long> {
}
