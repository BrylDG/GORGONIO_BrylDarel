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
        //need ilisdan ang file directory if mag change ug pc
        String filePath = "C:\\Users\\Bryl\\IdeaProjects\\LoveBound-20231211T140812Z-001\\LoveBound\\Users\\" + user.username + ".txt";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(user);
        }

        System.out.println("Success!");
    }
}
