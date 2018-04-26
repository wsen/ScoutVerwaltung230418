package de.gfn.oca.scoutcamp;

import de.gfn.oca.scoutcamp.entity.Scout;

/**
 *
 * @author tlubowiecki
 */
public class App {
    
    public static void main(String[] args) {
        
        System.out.println("START");
        //TODO: Scouts aus Datenbank oder Datei lesen
        
        // User-Eingabe verarbeiten
        
        Scout s1 = new Scout("Peter", "Parker");
        
        Scout s2 = new Scout();
        s2.setFirstname("Bruce");
        s2.setLastname("Wayne");
        
        //TODO: Scouts in die Datenbank oder Datei schreiben
        System.out.println("END");
    }
}
