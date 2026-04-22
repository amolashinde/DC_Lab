import java.rmi.server.*;
import java.rmi.*;
import java.util.HashMap;

public class HotelImpl extends UnicastRemoteObject implements HotelInterface {

    HashMap<String, String> data;

    public HotelImpl() throws RemoteException {
        data = new HashMap<>();
    }

    public String book(String name) throws RemoteException {
        if (data.containsKey(name))
            return "Already booked";
        data.put(name, "Booked");
        return "Room booked for " + name;
    }

    public String cancel(String name) throws RemoteException {
        if (data.containsKey(name)) {
            data.remove(name);
            return "Booking cancelled";
        }
        return "No booking found";
    }
}