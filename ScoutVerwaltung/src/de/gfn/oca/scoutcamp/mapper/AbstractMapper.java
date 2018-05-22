/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.scoutcamp.mapper;



/**
 *
 * @author student
 */
import de.gfn.oca.scoutcamp.entity.AbstractEntity;
import java.util.List;

public abstract class AbstractMapper<T extends AbstractEntity> {
    
    //CRUD 
    // BREAD Browse, Read, Add, Delete bei Web-Anwendungen
    
    
    //public abstract AbstractEntity find();
    public abstract List<T> find();
    
    //public abstract AbstractEntity find(int id);
    public abstract T find(int id);
    
    //Save Methode 1
    public boolean save(T entity) {  //nach außen augerufen //Nicht Scout, da sonst nichtz mehr abstrakt
        if(entity.getId() > 0) {
            return update(entity);
        }
        else {
            return insert(entity);
        }
    }
    
    protected abstract boolean insert(T entity); //nach aüßen nicht sichtbar //protected statt public
    
    protected abstract boolean update(T entity); //nach aüßen nicht sichtbar // .. Kapselung dadurch garantiert
    
    public abstract boolean delete(T entity); //nach aüßen nicht sichtbar
    
}
