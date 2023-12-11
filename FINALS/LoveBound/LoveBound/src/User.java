import java.io.Serializable;

public class User implements Serializable {
    public String[] tags = new String[6];
    String username;
    String password;

    public void sayHello(){
        System.out.println("Hello " + username);
    }
}
