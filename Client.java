/*
 * \file Client.java
 * \author IBIS Ibrahim
 * \date 30 avril 2017
 *
 * Interface client
 *
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Remote {
    public void lancement(int ordonnees)
    throws RemoteException;

    public void addOr(int value)
    throws RemoteException;

    public void addArgent(int value)
    throws RemoteException;

    public void addBronze(int value)
    throws RemoteException;

    public void stopRecolte()
    throws RemoteException;

    public int[] getAmountRess()
    throws RemoteException;

    public int volOr(int value)
    throws RemoteException;

    public int volArgent(int value)
    throws RemoteException;

    public int volBronze(int value)
    throws RemoteException;

    public Personnalite getPersonnalite()
    throws RemoteException;

    public Tache getTacheActuel()
    throws RemoteException;

    public void tonTour()
    throws RemoteException;


}
