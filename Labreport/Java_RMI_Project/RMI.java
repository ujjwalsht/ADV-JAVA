import java.rmi.*;

public interface RMI extends Remote {
    public int sum(int a, int b) throws RemoteException;
    public int sub(int a, int b) throws RemoteException;
}
