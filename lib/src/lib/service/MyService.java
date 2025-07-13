package lib.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Remote marcheaza ca MyService este o interfata
// ale carei metode vor fi invocate remote
public interface MyService extends Remote {

    // RemoteException trebuie obligatoriu propagata in fiecare metoda
    // din interfata si macheaza orice problema care ar putea
    // aparea in comunicarea client-server
     String reverse(String s) throws RemoteException;
}
