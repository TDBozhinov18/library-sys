package users;

public class Student extends User {
    private String course;
    private String year;

    public Student(int id, String name, String username, String passsword, int age) {
        super(id, name, username, passsword, age);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "users.Student{" +
                "course='" + course + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public void browseBook(){

    }
}
