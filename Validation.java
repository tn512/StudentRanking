
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Validation {

    private Scanner sc = new Scanner(System.in);

    //get input integer number between min and max
    public int inputInt(String mess, int min, int max) {
        System.out.print(mess);
        //force user input exectly integer number
        while (true) {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                //check range of number
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an integer number: ");
            }
        }
    }

    //get input double number between min and max
    public double inputDouble(String mess, double min, double max) {

        //force user input exectly double number
        while (true) {
            System.out.print(mess);
            String input = sc.nextLine();
            try {
                double number = Double.parseDouble(input);
                //check range of number
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + "\n");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an double number.");
            }
        }
    }

    //get non-empty string
    public String inputString(String mess) {
        System.out.print(mess);
        //force user input exectly non-empty string
        while (true) {
            String input = sc.nextLine();
            if (input.equals("")) {
                System.out.print("Please input a non-empty string: ");
                continue;
            }
            return input;
        }
    }

    //get Y-N question
    public int inputYesNo(String mess) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("Y") || input.equals("y")) {
                return 1;
            } else if (input.equals("N") || input.equals("n")) {
                return 0;
            } else {
                System.out.print("Wrong input!");
            }
        }
    }

    public float inputFloat(String mess, float min, float max) {

        //force user input exectly double number
        while (true) {
            System.out.print(mess);
            String input = sc.nextLine();
            try {
                float number = Float.parseFloat(input);
                //check range of number
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + "\n");
                    continue;
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.print("Please input an float number.");
            }
        }
    }
}
