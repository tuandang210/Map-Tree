package PracticeComparable;

public class Student implements Comparable<Student>{
    private String name;
    private int old;
    private String address;

    public Student() {
    }

    public Student(String name, int old, String address) {
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

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
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

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
