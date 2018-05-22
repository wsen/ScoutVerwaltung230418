package de.gfn.oca.scoutcamp.mapper;

import de.gfn.oca.scoutcamp.entity.Scout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ScoutMapper extends AbstractMapper<Scout> {
    
    private final String TABLE = "scouts";

    @Override
    public List<Scout> find() {
        String sql = "SELECT * FROM " + TABLE;
        
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoutbase2018", "root", "");
                Statement stmt = con.createStatement()) {
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                System.out.print(rs.getString("firstname"));
                System.out.print(rs.getString("lastname"));
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }

    @Override
    public Scout find(int id) {
        String sql = "SELECT * FROM " + TABLE + " WHERE id = " + id;
        return null;
    }

    @Override
    protected boolean insert(Scout entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean update(Scout entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Scout entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
