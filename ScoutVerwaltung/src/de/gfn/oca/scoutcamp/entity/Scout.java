package de.gfn.oca.scoutcamp.entity;

import java.time.LocalDate;

/**
 *
 * @author itomski
 */
public class Scout {
    
    private int id;
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private boolean aktive;

    public Scout() {
        this("ohne Vornamen", "ohne Nachnamen");
    }
    
    public Scout(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isAktive() {
        return aktive;
    }

    public void setAktive(boolean aktive) {
        this.aktive = aktive;
    }
    
    @Override
    public String toString() {
        return "Name: " + firstname + " " + lastname;
    }
}
