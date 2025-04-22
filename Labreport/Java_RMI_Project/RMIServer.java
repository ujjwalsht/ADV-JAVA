import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements RMI {

    public RMIServer() throws RemoteException {
        super();
    }

    public int sum(int x, int y) throws RemoteException {
        return x + y;
    }

    public int sub(int x, int y) throws RemoteException {
        return x - y;
    }

    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("Server", new RMIServer());
            System.out.println("Server started and registered.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
