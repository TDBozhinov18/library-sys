package users;

public class Librarian extends User {

    private String department;

    public Librarian(int id, String name, String username, String passsword, int age, String department) {
        super(id, name, username, passsword, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "users.Librarian{" +
                "department='" + department + '\'' +
                '}';
    }

    public void enableUser(){

    }

    public void disableUser(){

    }

}
