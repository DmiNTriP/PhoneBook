/**
 * Created by Kyler on 4/17/2016.
 */
public class Node {

    private int key;
    private String eMail;
    private String phoneNumber;
    private Employee theEmployee;
    Node leftChidNode;
    Node rightChidNode;

    public Node(Employee theEmployee) {
        this.theEmployee = theEmployee;
    }

    public Employee getTheEmployee() {
        return theEmployee;
    }

    public void setTheEmployee(Employee theEmployee) {
        this.theEmployee = theEmployee;
    }


    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Node{" +
                "Employee key=" + key +
                ",Employee  eMail='" + eMail + '\'' +
                ", Employee phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
