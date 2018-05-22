package de.gfn.oca.scoutcamp.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Träger aller Eigenschaften die alle Objekte gemeinsam haben, wie id, status, ...
 * @author student
 */
public abstract class AbstractEntity implements Serializable {
    
    private int id;
    private int status;
    private LocalDateTime created; //Wann wurde dieses Objekt erzeugt
    private LocalDateTime updated; //Änderungen

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
    
    public abstract String[] toArray(); //um sich spontan die Werte zurückliefern zu lassen

}

