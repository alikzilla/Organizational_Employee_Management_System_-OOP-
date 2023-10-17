package SduPractice.PA.PA15A;

public class Teacher extends Person{
    String subject;
    Teacher(String name, int age, String address, String phoneNumber, String subject) {
        super(name, age, address, phoneNumber);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String toString(){
        return String.valueOf(getClass()) + "[name=" + getName() + ", age=" + getAge() + ", address=" + getAddress() +
                " Broadway, phoneNumber=" + getPhoneNumber() + ", " +
                "subject=" + getSubject() + "]";
    }
}
