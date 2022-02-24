// Control file

package com.nguyenle.mitarbeiterverwaltung;

import com.nguyenle.mitarbeiterverwaltung.model.Mitarbeiter;
import com.nguyenle.mitarbeiterverwaltung.service.MitarbeiterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mitarbeiter")
public class MitarbeiterResource {
    private final MitarbeiterService mitarbeiterService;

    public MitarbeiterResource(MitarbeiterService mitarbeiterService) {
        this.mitarbeiterService = mitarbeiterService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Mitarbeiter>> getAllMitarbeiter() {
        List<Mitarbeiter> mitarbeiters = mitarbeiterService.findAllMitarbeiter();
        return new ResponseEntity<>(mitarbeiters, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Mitarbeiter> getMitarbeiterById(@PathVariable("id") Long id) {
        Mitarbeiter mitarbeiter = mitarbeiterService.findMitarbeiter(id);
        return new ResponseEntity<>(mitarbeiter, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Mitarbeiter> addMitarbeiter(@RequestBody Mitarbeiter mitarbeiter) {
        Mitarbeiter neuMitarbeiter = mitarbeiterService.addMitarbeiter(mitarbeiter);
        return new ResponseEntity<>(neuMitarbeiter, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMitarbeiter(@PathVariable("id") Long id) {
        mitarbeiterService.deleteMitarbeiter(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Mitarbeiter> updateMitarbeiter(@RequestBody Mitarbeiter mitarbeiter) {
        Mitarbeiter updateMitarbeiter = mitarbeiterService.updateMitarbeiter(mitarbeiter);
        return new ResponseEntity<>(updateMitarbeiter, HttpStatus.OK);
    }


}
