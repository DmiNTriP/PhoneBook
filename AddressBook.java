/**
 * Created by Kyler on 4/10/2016.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Dictionary;

public class AddressBook {


    public static void main(String[] args) throws IOException, NullPointerException {
        Employee emp = new Employee("Kyler","e,", "g");
//        BucketHashing bh = new BucketHashing(emp);
        BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
        String choice = "";
        LinkedList addEmployee = new LinkedList();
        // HashTable table = new HashTable();


        System.out.println("To add an Employee to the Address Book please input add or done into the console");
        choice = mReader.readLine();


        do {
/*            //why doesnt this let me move onto the switch statement
//            if (!choice.equals("add")|| !choice.equals("done")){
//                System.exit(0);*/

            switch (choice) {
                case "add":
                    System.out.println("Please Enter Employees first Name");
                    //=  mReader.readLine()
                    emp.setFirstName(mReader.readLine());
                    System.out.println("Please Enter Employees Last Name");
                    emp.setLastName(mReader.readLine());
                    String fullName = emp.getFirstName().toUpperCase().concat(emp.getLastName().toUpperCase());
                    System.out.println("Please Enter employees email address");
                    emp.setEmail(mReader.readLine());
                    System.out.println("Please Enter employees phone number");
                    // check for digits in phone number if time permits
                    emp.setPhoneNum(mReader.readLine());


                    System.out.printf("%s %n The hashcode is: %s %n %s %n %s%n", emp.fullName(), emp.fullName().hashCode(), emp.getEmail(), emp.getPhoneNum());
                    addEmployee.insert(emp.fullName(), emp.getEmail(), emp.getPhoneNum());
                    System.out.println();
                    System.out.println("  Please input either add to add another employee or done to exit the program");
                    choice = mReader.readLine();
                    break;
                case "done":
                    System.out.println("Thanks for entering the employees information");
                    break;
                default:
                    System.out.println("you got to enter something here ");
                    System.out.println("Please enter add or done into the system to exit program");
                    choice = mReader.readLine();
                    break;

            }

        } while (!choice.equals("done"));
        System.out.println("Thanks for entering the employees information");
    }
}











