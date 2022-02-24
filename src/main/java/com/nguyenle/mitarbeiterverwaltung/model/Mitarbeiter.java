package com.nguyenle.mitarbeiterverwaltung.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Mitarbeiter implements Serializable {
    // implements this class to a string for later JSON
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String name;
    private String email;
    private String jobTitel;
    private String phoneNumber;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String mitarbeiterCode;

    public Mitarbeiter() {
    }

    public Mitarbeiter(String name, String email, String jobTitel, String phoneNumber, String imageUrL, String mitarbeiterCode) {
        this.name = name;
        this.email = email;
        this.jobTitel = jobTitel;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrL;
        this.mitarbeiterCode = mitarbeiterCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitel() {
        return jobTitel;
    }

    public void setJobTitel(String jobTitel) {
        this.jobTitel = jobTitel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMitarbeiterCode() {
        return mitarbeiterCode;
    }

    public void setMitarbeiterCode(String mitarbeiterCode) {
        this.mitarbeiterCode = mitarbeiterCode;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitel='" + jobTitel + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", mitarbeiterCode='" + mitarbeiterCode + '\'' +
                '}';
    }
}
