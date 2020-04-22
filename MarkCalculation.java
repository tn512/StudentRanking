/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.*;

public class MarkCalculation {

    Validation v = new Validation();

    void createStudent(List<Student> students) {
        String name = v.inputString("Name:");
        String className = v.inputString("Classes:");
        double maths = v.inputDouble("Maths:", 0, 10);
        double chemistry = v.inputDouble("Chemistry:", 0, 10);
        double physics = v.inputDouble("Physics:", 0, 10);

        double average = (maths + chemistry + physics) / 3;
        String type;

        if (average > 7.5) {
            type = "A";
        } else if (average >= 6) {
            type = "B";
        } else if (average >= 4) {
            type = "C";
        } else {
            type = "D";
        }

        Student s = new Student(name, className, maths, physics, chemistry);
        students.add(s);
    }

    List<Student> averageStudent(List<Student> students) {
        for (Student s : students) {
            double averageMark = (s.getMath() + s.getChemistry() + s.getPhysical()) / 3;
            s.setAverage(averageMark);

            if (averageMark > 7.5) {
                s.setType("A");
            } else if (averageMark >= 6) {
                s.setType("B");
            } else if (averageMark >= 4) {
                s.setType("C");
            } else {
                s.setType("D");
            }
        }
        return students;
    }

    void displayStudentsInfo(List<Student> students) {
        int i = 0;
        for (Student s : students) {
            System.out.println("------ Student" + i + " Info ------");
            System.out.println("Name:" + s.getStudentName());
            System.out.println("Classes:" + s.getStudentClass());
            System.out.println("AVG:" + s.getAverage());
            System.out.println("Type:" + s.getType());
            i++;
        }
    }

    HashMap<String, Double> getPercentTypeStudent(List<Student> students) {
        double numberStudent = 0;
        int A = 0, B = 0, C = 0, D = 0;
        HashMap<String, Double> type = new HashMap<>();

        for (Student s : students) {
            if (s.getType().equals("A")) {
                A++;
            } else if (s.getType().equals("B")) {
                B++;
            } else if (s.getType().equals("C")) {
                C++;
            } else if (s.getType().equals("D")) {
                D++;
            }
            numberStudent++;
        }
        type.put("A", (A / numberStudent) * 100);
        type.put("B", (B / numberStudent) * 100);
        type.put("C", (C / numberStudent) * 100);
        type.put("D", (D / numberStudent) * 100);
        return type;
    }

    void displayPercentTypeStudent(HashMap<String, Double> type) {
        System.out.println("------ Classification Info ------");
        System.out.println("A:" + type.get("A"));
        System.out.println("B:" + type.get("B"));
        System.out.println("C:" + type.get("C"));
        System.out.println("D:" + type.get("D"));

    }

}
