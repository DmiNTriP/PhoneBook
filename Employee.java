public class Employee{

    private String mFirstName;
    private String mLastName;
    private String mEmail;
    private String mPhoneNum;
    private Employee mNext = null;

    public Employee(String name,String eMail, String phoneNum ) {
        String fn = mFirstName + mLastName;
        fn = name;
        mEmail = eMail;
        mPhoneNum = phoneNum;
    }

    public Employee getNext() {
        return mNext;
    }

    public void setNext(Employee next) {
        mNext = next;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getPhoneNum() {
        return mPhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        mPhoneNum = phoneNum;
    }

public String fullName(){
  return getFirstName().toUpperCase().concat(getLastName().toUpperCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!mFirstName.equals(employee.mFirstName)) return false;
        if (!mLastName.equals(employee.mLastName)) return false;
        if (mEmail != null ? !mEmail.equals(employee.mEmail) : employee.mEmail != null) return false;
        return mPhoneNum != null ? mPhoneNum.equals(employee.mPhoneNum) : employee.mPhoneNum == null;

    }

    @Override
    public int hashCode() {
        int result;
        result = Math.abs(fullName().hashCode())% 13;
        /*/*//*(Amy said that Math.abs will ensure there are only positive numbers in my hashcode
        result = Math.abs(result + mLastName.toUpperCase().hashCode())% 13);*/
        return result;
        }


    @Override
    public String toString() {
        return "Employees full name " + fullName() +
                "Employeees HashCode: "+ hashCode() +
                "Employee{" +
                "mEmail='" + mEmail + '\'' +
                ", mPhoneNum='" + mPhoneNum + '\'' +
                '}';
    }
}
