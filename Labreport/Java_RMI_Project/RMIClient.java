import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            RMI rmi = (RMI) reg.lookup("Server");

            System.out.println("Client connected to server");
            System.out.println("Sum of 450 and 445 = " + rmi.sum(450, 445));
            System.out.println("Difference of 450 and 445 = " + rmi.sub(450, 445));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
