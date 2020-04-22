/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Student {
    private String studentName, studentClass, type;
    private double math, physical, chemistry, average;

    public Student(String studentName, String studentClass, String type, double math, double physical, double chemistry, double average) {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.type = type;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
        this.average = average;
    }

    public Student() {
    }

    public Student(String studentName, String studentClass, double math, double physical, double chemistry) {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }
    

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
    
}
