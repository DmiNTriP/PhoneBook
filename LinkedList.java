
public class LinkedList {

    //*/references to first Link in the List && Last Link added to List
//*/    public HashBuckets firstLink;
    //TODO: Employee is a reference to the Link objecft
    Employee firstEmployee = null;


    public LinkedList() {

        //first link always starts as null value when you create a linked list
        LinkedList firstLink = null;


    }

    public boolean isEmpty() {
        return (firstEmployee == null);
    }


    public Employee insert(String fullName, String eMail, String phoneNum) {
        Employee newEmployee = new Employee(fullName, eMail, phoneNum);
        while (newEmployee != null) {
            newEmployee = newEmployee.getNext();
        }
        //ADDS THE EMPLOYEE OBJECT TO
        return newEmployee;
    }

    //will remove the employee fromt he list
    public Employee removeFirst() {
        Employee lastEmployee = firstEmployee;
        //checking t see if the linked list is empty//TODO: May need to change the if statement into an while statement
        if (!isEmpty()) {
            firstEmployee = firstEmployee.getNext();
        }
        return lastEmployee;
    }

    public Employee search() {
        Employee currentEmployee = firstEmployee;
        while (currentEmployee != null) {
            System.out.println("Next Employee: is " + currentEmployee.getNext());
            currentEmployee = currentEmployee.getNext();
        }
        return currentEmployee;
    }

    public Employee findEmployee(int hashKey) {
        Employee current = firstEmployee;

        //?first check to see if the list is empty
        if (!isEmpty()) {
            while (current.hashCode() != hashKey) {
                // need to verify if there even is a match
                if (current.getNext() == null) {
                    return null;

                } else {
                    current = current.getNext();
                }

            }


        }

        //remove a Employee whop is not the first Employee of the company
        return current;
    }

    public Employee removeEmployee(Employee emp) {
        Employee current = firstEmployee;
        Employee employeeBefore = firstEmployee;

        while (current.hashCode() != emp.hashCode()) {
            // first need to check if the list is null
            if (current.getNext() == null) {
                return null;
            } else {
                //the employee before needs to be referenced to make the current Employee before the first Employee
                employeeBefore = current;
                current = current.getNext();
            }
        }
        if (current == firstEmployee) {
            // if the first employee is the employee who was searched
            firstEmployee = firstEmployee.getNext();
        } else {
            //if it was another employee who was searched
            // employeeBefore.getNext() = current.getNext();
        }
        return current;


    }
}


