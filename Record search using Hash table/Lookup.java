import java.io.*;
import java.util.*;

public class Lookup {

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader input = new BufferedReader(new FileReader(fileName));
        Hashtable<String, String> lookupData = new Hashtable<String, String>();
        String record = "";
        String[] data;
        while ((record = input.readLine()) != null) {
            data = record.split("\"");
            lookupData.put(data[0], data[1]);
            System.out.println(data[0] + ":" + data[1]);
        }
        input.close();
        
        boolean exit = false;
        Scanner numbers = new Scanner(System.in);
        String number = null;
        String name = null;
        
        System.out.println("Type exit to stop the application");
        while (!exit) {
            System.out.print("Enter mobile number: ");
            number = numbers.next();
            if (number.equals("exit")) {
                System.exit(0);
            }
            if (lookupData.get(number) != null) {
                name = lookupData.get(number).toString();
                System.out.println("This number belongs to " + name);
            } else {
                System.out.println("No Information");
            }
        }
    }
}