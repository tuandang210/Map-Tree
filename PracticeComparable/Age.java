package PracticeComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Age implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getOld() > o2.getOld()) {
            return 1;
        } else if (o1.getOld() == o2.getOld()) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Collections.sort(students);
        for (Student x: students){
            System.out.println(x.toString());
        }

        Age age = new Age();
        Collections.sort(students,age);
        System.out.println("So sánh tuổi: ");
        for (Student x: students){
            System.out.println(x.toString());
        }
    }
}
