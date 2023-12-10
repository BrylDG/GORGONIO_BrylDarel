import java.io.*;
import java.util.Scanner;

public class UserRegistrationSerialization {
    public void main() throws IOException {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("Enter username: ");
        user.username = sc.nextLine();
        System.out.println("Enter password: ");
        user.password = sc.nextLine();

        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\User\\Documents\\IntelliJ Projects\\LoveBound\\Users\\" + user.username + ".txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Success!");
    }
}
