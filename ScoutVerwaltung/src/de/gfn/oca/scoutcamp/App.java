package de.gfn.oca.scoutcamp;

import de.gfn.oca.scoutcamp.entity.Scout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tlubowiecki
 */
public class App {
    
    private List<Scout> scouts = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("START");
        
        App app = new App();
        
        //TODO: Scouts aus Datenbank oder Datei lesen
        
        // User-Eingabe verarbeiten
        
        boolean exit = false;
        
        while(!exit) {
            
            switch(scanner.next()) {
                
                case "N": System.out.println("New Scout"); 
                    break;
                    
                case "L": System.out.println("List of Scout"); 
                    break;
                    
                case "X": System.out.println("Exit");
                    exit = true;
                    break;
            }
            
            
            
            /*
            String firstname = scanner.next();
            String lastname = scanner.next();
            
            if(firstname.equalsIgnoreCase("exit"))
                break;
            
            Scout s = new Scout(firstname, lastname);
            app.scouts.add(s);
            System.out.println(s);
            */
        }
        
        //TODO: Scouts in die Datenbank oder Datei schreiben
        System.out.println("END");
    }
}
