/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author mKs
 */
public interface SpellingInterface extends Remote{
   public String correct(String word) throws RemoteException;
}
