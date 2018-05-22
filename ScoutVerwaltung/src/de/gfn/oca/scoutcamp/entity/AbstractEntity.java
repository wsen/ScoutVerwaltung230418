package de.gfn.oca.scoutcamp.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Administrator
 */
public abstract class AbstractEntity implements Serializable {
    
    private int id;
    
    private int status;
    
    private LocalDateTime created;
    
    private LocalDateTime updated;

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
    
    public abstract String[] toArray();
}
