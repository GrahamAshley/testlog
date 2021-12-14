package com.test;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
        LocateRegistry.createRegistry(8888);
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8888);
        Reference reference = new Reference("com.test.Test", "com.test.Test", null);
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("sad",referenceWrapper);
    }
}
