package activity;
import java.util.*;

public class activityContd {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        Activity student = new Activity();
        
        System.out.println("Enter first name: ");
        student.setFirstName(sc.nextLine());
        
        System.out.println("Enter middle name: ");
        student.setMiddleName(sc.nextLine());
        
        System.out.println("Enter last name: ");
        student.setLastName(sc.nextLine());
        
        System.out.println("Enter suffix: ");
        student.setSuffix(sc.nextLine());

        System.out.println("First name: " + student.getFirstName() +
            " \n Middle name: " + student.getMiddleName() +
            " \n Last Name: " + student.getLastName() +
            " \n Suffix: " + student.getSuffix() +
            " \n Full Name: " + student.getFullName());
    }
}