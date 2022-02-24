package com.nguyenle.mitarbeiterverwaltung.repo;

import com.nguyenle.mitarbeiterverwaltung.model.Mitarbeiter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Using JpaRepository to save and update Mitarbeiter
public interface MitarbeiterRepo extends JpaRepository<Mitarbeiter, Long> {

    void deleteMitarbeiterById(Long id);

    Optional<Mitarbeiter> findMitarbeiterById(Long id);
}
