import java.rmi.*;

public interface HotelInterface extends Remote {
    String book(String name) throws RemoteException;
    String cancel(String name) throws RemoteException;
}