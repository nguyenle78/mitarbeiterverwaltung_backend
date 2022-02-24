package com.nguyenle.mitarbeiterverwaltung.service;

import com.nguyenle.mitarbeiterverwaltung.exception.UserNotFoundException;
import com.nguyenle.mitarbeiterverwaltung.model.Mitarbeiter;
import com.nguyenle.mitarbeiterverwaltung.repo.MitarbeiterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
// @Transactional for Delete request to work?
@Transactional
public class MitarbeiterService {
    private final MitarbeiterRepo mitarbeiterRepo;

    @Autowired
    public MitarbeiterService(MitarbeiterRepo mitarbeiterRepo) {
        this.mitarbeiterRepo = mitarbeiterRepo;
    }

    public Mitarbeiter addMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiter.setMitarbeiterCode(UUID.randomUUID().toString());
        return mitarbeiterRepo.save(mitarbeiter);
    }

    public List<Mitarbeiter> findAllMitarbeiter() {
        return mitarbeiterRepo.findAll();
    }

    public Mitarbeiter updateMitarbeiter(Mitarbeiter mitarbeiter) {
        return mitarbeiterRepo.save(mitarbeiter);
    }

    public void deleteMitarbeiter(Long id) {
        mitarbeiterRepo.deleteMitarbeiterById(id);
    }

    public Mitarbeiter findMitarbeiter(Long id) {
        return mitarbeiterRepo.findMitarbeiterById(id).orElseThrow(() -> new
                UserNotFoundException("Mitarbeiter mit id: " + id + " nicht gefunden"));
    }
}