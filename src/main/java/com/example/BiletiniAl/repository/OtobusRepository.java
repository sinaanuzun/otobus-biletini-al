package com.example.BiletiniAl.repository;

import com.example.BiletiniAl.entities.Otobus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtobusRepository extends JpaRepository<Otobus, Long> {
}