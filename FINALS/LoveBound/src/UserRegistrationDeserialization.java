import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserRegistrationDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\User\\Documents\\IntelliJ Projects\\LoveBound\\Account.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.username);
        System.out.println(user.password);

        user.sayHello();
    }
}
