package Project1;

public abstract class ANemployDetail {
    String name;
    int age;
    private int id;
    protected String email;
    String position;
    protected long contact;
    protected float salary;

    ANemployDetail() {

    }

    ANemployDetail(String name, int age, int id, String email, String position, long contact, float salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.email = email;
        this.position = position;
        this.contact = contact;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}