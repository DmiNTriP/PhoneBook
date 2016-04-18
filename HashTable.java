import sun.awt.image.ImageWatched;

*
        *Created by Kyler on 4/14/2016.


public class HashTable {
    private int mKey;
    private int mValue;
    private Employee mEmployees;
    private String mTheEmployee;


    public LinkedList[] getTable() {


        return mTable;
    }

    public void setTable(LinkedList[] table) {
        mTable = table;
    }

    // Linklist class array is going to hold Employee objects
    private LinkedList[] mTable = null;
    /
            (
    CREATING EMPLOYEE
    FIRST WORD
    OBJECT)
    Employee firstEmp = mEmployees;


    public String getTheEmployee() {
        return mTheEmployee;
    }

    public void setTheEmployee(String theEmployee) {
        mTheEmployee = theEmployee;
    }


    // Data structures book implementation


    public int getValue() {
        return mValue;
    }

    public void setValue(int value) {
        mValue = value;
    }

    public int getKey() {
        return mKey;
    }

    public void setKey(int key) {
        mKey = key;
    }


/

    (
    CREATING EMPLOYEE
    FIRST WORD
    OBJECT)

    public HashTable(int value, int key) {
        mValue = value;
        mKey = key;
    }


    // adding Linked List entrys to the HashTable

    public Employee addEntry(Employee emp) {
        int index = getKey();
        //////////////////////// These Employee Classes are not Relevant at this point in time in my code
        Employee newNode = null;
        Employee nodeBefore = null;
        Employee lastNode = null;
        //////////////////////////////
        if (getTable()[index] == null) {
            // creating an Link List for the table to point to
            getTable()[index] = new LinkedList();
        }
        //add emp  to link list
        getTable()[index].insert(emp);
        for (int i = 0; i < getTable().length; i++)
            System.out.println(getTable());
        return emp;


    }

    public boolean isEmpty() {
        return LinkedList.
    }

    /
            (
    THIS CODE
    BELOW IS
    FROM THE
    LINKED LIST
    CLASS AND
    WILL BE
    THE CODE
    THAT I
    WILL USE
    FOR THE
    SEARCH FUNCTION
    )
            /
            (
    I AM
    GOING TO
    REFORMAT THIS
    CODE SO
    THAT AS
    A PARAMETER
    IT WILL
    TAKE A
    EMPLOYEE OBJECT
    AND A
    STRING VALUE
    AS PARAMETERS

    public LinkedList linkFound(int key, String empFullName) {/
        (may need to change employee object to String)

//        boolean found = false;  THIS CODE WAS NOT NEEDED AT THIS POINT THIS MAY CHANGE!
        Employee currentNode = firstEmp;

        //? While Current Employee(CurrentNode) is nothing && the hashKey is less than or equal to the currently searched key
        while (currentNode != null && currentNode.hashCode() <= key) {
            //?if the search key finds the fullname of the employee
            if (currentNode.fullName().equals(empFullName)) {
                //? return that employee back to the proogram
                return currentNode;
            }
            currentNode = currentNode.getNext();
            System.out.println("Employee: " + currentNode.fullName() + " and the hashcode is " + currentNode.hashCode());
            //?else continue the search and

        }
        //?Return nothing
        return null;
    }

    //? this method will remove an object from the Address book if called to do so
    public Employee remove(int hashKey, Employee emp) {
        Employee currentNode = null;
        boolean found;
        //? assigning the hashk
        int index = getKey();

        //?cycles through all the nodes in the table
        for (int i = 0; i < getTable().length; i++) {
            LinkedList hashTable = getTable()[i];
            if (hashTable[emp].fullName().hashCode()) {
                found = true;


            }
        }

    }


}


