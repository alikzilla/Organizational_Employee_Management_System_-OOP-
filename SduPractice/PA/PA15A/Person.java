package SduPractice.PA.PA15A;

public class Person {
    String name;
    int age;
    String address;
    String phoneNumber;
    Person(String name, int age, String address, String phoneNumber){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString(){
        return String.valueOf(getClass()) + "[name=" + getName() + ", age=" + getAge() + ", address=" + getAddress() +
                " Broadway, phoneNumber=" + getPhoneNumber() + "]";
    }
}
