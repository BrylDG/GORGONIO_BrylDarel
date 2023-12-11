import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Tags {
    public void TagsCustomization(User user) throws IOException {
        Scanner sc = new Scanner(System.in);
        String filePath = "C:\\Users\\Bryl\\IdeaProjects\\LoveBound-20231211T140812Z-001\\LoveBound\\UserTags\\" + user.username + "Tags.txt";
        System.out.println("Customize Tags:" + "\n1.Enter Tags \n2.Skip");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < user.tags.length; i++) {
                    if (i == 0) {
                        user.tags[i] = user.username;
                    } else {
                        System.out.println("Enter tag for index " + i + ":");
                        user.tags[i] = sc.next();
                    }
                }
                try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
                    out.writeObject(user);
                }

                System.out.println("Success!");
                break;
            case 2:
                System.out.println(Arrays.toString(user.tags));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
