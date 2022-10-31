import java.util.Scanner;

public class EmployeeDetails_Parents extends PersonalDetails_GrandParents{

    public static void personalDetails() {

        Scanner scanner = new Scanner(System.in);

//        PersonalDetails_GrandParents personalDetails_grandParents = new PersonalDetails_GrandParents();
//
//        personalDetails_grandParents.personalDetails();

        System.out.print("Employee ID: " );
        int employeeID = scanner.nextInt();

        System.out.print("Designation: ");
        String designation = scanner.next();

    }

    public static void main(String[] args) {
//        PersonalDetails_GrandParents personalDetails_grandParents = new EmployeeDetails_Parents();
//        personalDetails_grandParents.personalDetails();
    personalDetails();
        PersonalDetails_GrandParents.personalDetails();
    }
}
