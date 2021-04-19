package PracticeMap2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Tuấn","30","Ha Noi");
        Student student2 = new Student("Thành","20","Ha Noi");
        Student student3 = new Student("Tú","32","Ha Noi");

        Map<Integer, Student> map = new HashMap<>();
        map.put(1,student1);
        map.put(2,student2);
        map.put(3,student3);

        for (Map.Entry<Integer, Student> x : map.entrySet()){
            System.out.println(x.toString());
        }

        System.out.println("...........Set");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
