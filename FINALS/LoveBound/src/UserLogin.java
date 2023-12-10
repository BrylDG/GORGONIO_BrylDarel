import java.io.*;
import java.util.Scanner;

public class UserLogin {

    public void main() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("LOGIN:");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (login(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
        scanner.close();
    }

    private static boolean login(String enteredUsername, String enteredPassword) throws IOException {
        //need ilisdan ang file directory if mag change ug pc
        String filePath = "C:\\Users\\Bryl\\IdeaProjects\\LoveBound\\Users\\" + enteredUsername + ".txt";

        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(filePath))) {
            User storedUser = (User) obj.readObject();

            return enteredUsername.equals(storedUser.username) && enteredPassword.equals(storedUser.password);
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
