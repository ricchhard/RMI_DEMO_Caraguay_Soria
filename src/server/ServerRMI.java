package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerRMI {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);

            IHelloService helloService = new HelloServiceImpl();

            Naming.rebind("HelloService", helloService);

            System.out.println("Servidor Listo y agregado en HelloService.");

        } catch (MalformedURLException | RemoteException e){
            e.printStackTrace();
        }
    }
}
