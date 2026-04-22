import java.rmi.registry.*;
import java.util.Scanner;

public class HotelClient {
    public static void main(String args[]) {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            HotelInterface obj = (HotelInterface) reg.lookup("hotel");

            Scanner sc = new Scanner(System.in);

            System.out.println("1.Book  2.Cancel");
            int ch = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            if (ch == 1)
                System.out.println(obj.book(name));
            else
                System.out.println(obj.cancel(name));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}