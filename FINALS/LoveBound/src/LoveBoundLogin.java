import java.io.IOException;
import java.util.*;
public class LoveBoundLogin {
    public static void main(String[] args) throws IOException {
        UserRegistrationSerialization registration = new UserRegistrationSerialization();
        System.out.println("Welcome to LoveBound, where dates matter");
        System.out.println("\n1. Login" + "\n2. Register" + "\n3.Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                break;
            case 2:
                registration.main();
                break;
            case 3:
                System.out.print("Exiting program!");
                break;
            default:
                System.out.print("Enter valid choice");
        }
    }
}
