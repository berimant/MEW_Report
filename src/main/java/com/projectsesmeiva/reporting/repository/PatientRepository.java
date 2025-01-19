package com.projectsesmeiva.reporting.repository;


import com.projectsesmeiva.reporting.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
