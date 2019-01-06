package at.ac.fh_kufstein.uebung.Aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe5 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Magdalena", 1810653965, 2018));
        studentList.add(new Student("blabala1", 123456789, 2017));
        studentList.add(new Student("blabla2", 987654321, 2016));

        for (Student s: studentList){
            System.out.println(s);
        }
    }

}
