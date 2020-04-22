
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validation v = new Validation();
        MarkCalculation mc = new MarkCalculation();
        List<Student> students = new ArrayList<>();
        
        System.out.println("====== Management Student Program ======");
        do{
            mc.createStudent(students);
        }while(v.inputYesNo("Do you want to enter more student information?(Y/N):")==1);
        mc.averageStudent(students);
        mc.displayStudentsInfo(students);
        mc.displayPercentTypeStudent(mc.getPercentTypeStudent(students));
    }
    
}
