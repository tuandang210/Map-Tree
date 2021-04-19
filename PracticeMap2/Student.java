package PracticeMap2;

public class Student {
    private String name;
    private String old;
    private String address;

    public Student() {
    }

    public Student(String name, String old, String address) {
        this.name = name;
        this.old = old;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", old='" + old + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
