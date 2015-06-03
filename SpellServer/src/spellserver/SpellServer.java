package spellserver;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import spellimplementation.SpellImplementation;

/**
 *
 * @author mKs
 */
public class SpellServer {

   
    public static void main(String[] args) {
       try
       {
           Registry myReg=LocateRegistry.createRegistry(1099);
           SpellImplementation s= new SpellImplementation("big.txt");
           myReg.bind("mySpell", s);
           System.out.println("Server Started...");
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
    }
    
}
