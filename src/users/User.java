package users;

public class User {
    private int id;
    private String name;
    private String username;
    private String passsword;
    private int age;


    public User(int id, String name, String username, String passsword, int age) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.passsword = passsword;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "users.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", passsword='" + passsword + '\'' +
                ", age=" + age +
                '}';
    }

    public void create(){

    }

    public void update(){

    }

}
