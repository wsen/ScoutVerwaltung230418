package de.gfn.oca.scoutcamp.mapper;

import de.gfn.oca.scoutcamp.entity.AbstractEntity;
import java.util.List;

/**
 *
 * @author Administrator
 */
public abstract class AbstractMapper<T extends AbstractEntity> {
    
    //CRUD 
    // BREAD Browse, Read, Add, Delete bei Web-Anwendungen
    
    //public abstract AbstractEntity find();
    public abstract List<T> find();
    
    public abstract T find(int id);
    
    //Save Methode 1
    public boolean save(T entity) { //nach außen augerufen //Nicht Scout, da sonst nicht mehr abstrakt
        
        if(entity.getId() > 0) {
            return update(entity);
        }
        else {
            return insert(entity);
        }
    }
    
    protected abstract boolean insert(T entity); //nach außen nicht sichtbar //protected statt public
    
    protected abstract boolean update(T entity); //nach außen nicht sichtbar // .. Kapselung dadurch garantiert
    
    public abstract boolean delete(T entity);
}
