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

public abstract class AbstractMapper {
    
    //CRUD 
    // BREAD Browse, Read, Add, Delete bei Web-Anwendungen
    public abstract AbstractEntity find();
    
    public abstract AbstractEntity find(int id);
    
    
    //Save Methode 1
    public boolean save(AbstractEntity entity) {  //nach außen augerufen //Nicht Scout, da sonst nichtz mehr abstrakt
        if(entity.getId() > 0) {
            return update(entity);
        }
        else {
            return insert(entity);
        }
    }
    
    public boolean insert(AbstractEntity entity) { //nach aüßen nicht sichtbar
        
    }
    
    public boolean update(AbstractEntity entity) { //nach aüßen nicht sichtbar
        
    }
    
    
    
}
