/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellclient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import spellinterface.SpellingInterface;

/**
 *
 * @author mKs
 */
public class SpellClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try
        {
            Registry myReg=LocateRegistry.getRegistry("202.51.94.195",1099);
            SpellingInterface s=(SpellingInterface)myReg.lookup("mySpell");
            String toCorrect="bok";
            System.out.println("The Correct spelling is:"+s.correct(toCorrect));
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
