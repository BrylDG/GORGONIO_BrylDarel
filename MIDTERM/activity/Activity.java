package activity;
import java.util.*;

public class Activity {
    private String first_name = "";
    private String middle_name = "";
    private String last_name = "";
    private String suffix = "";

    public void setFirstName(String firstName) {
        first_name = firstName;
    }

    public void setMiddleName(String middleName) {
        middle_name = middleName;
    }

    public void setLastName(String lastName) {
        last_name = lastName;
    }

    public void setSuffix(String Suffix) {
        suffix = Suffix;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getMiddleName() {
        return middle_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getFullName() {
        return first_name + " " + middle_name + " " + last_name + " " + suffix;
    }

    public String getSuffix() {
        return suffix;
    }
}