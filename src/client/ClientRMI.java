package client;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import server.IHelloService;

public class ClientRMI {
    public static void main(String[] args) {
        try {
            //Busca el objeto remoto en el registro RMI
            IHelloService helloService = (IHelloService) Naming.lookup("rmi://10.40.43.90/HelloService");

            //Invoca el metodo remoto
            String response = helloService.sayHello("Mikela");
            System.out.println("Respuesta del servidor: " + response);
        } catch (Exception e) {
            System.err.println("Error al conectar con el servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}