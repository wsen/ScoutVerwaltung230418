package de.gfn.oca.scoutcamp.mapper;

import de.gfn.oca.scoutcamp.entity.AbstractEntity;

/**
 *
 * @author Administrator
 */
public abstract class AbstractMapper {
    
    //CRUD
    public abstract AbstractEntity find();
    
    public abstract AbstractEntity find(int id);
    
    public boolean save(AbstractEntity entity) {
        
        if(entity.getId() > 0) {
            return update(entity);
        }
        else {
            return insert(entity);
        }
    }
    
    public boolean insert(AbstractEntity entity) {
    }
    
    public boolean update(AbstractEntity entity) {
    }
}
