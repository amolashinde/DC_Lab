import java.rmi.registry.*;

public class HotelServer {
    public static void main(String args[]) {
        try {
            HotelImpl obj = new HotelImpl();

            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("hotel", obj);

            System.out.println("Server ready...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}