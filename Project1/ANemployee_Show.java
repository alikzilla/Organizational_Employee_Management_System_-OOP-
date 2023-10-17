package Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ANemployee_Show {
    int i = 0;
    String[] inf = {"Employee ID: ", "Employee Name     : ", "Age: ", "Employee Contact  : ", "Email Information : ", "Employee Position : ", "Employee Salary   : "};
    public void getInfo(int id) {
        try {
            File file = new File("D:\\Desktop\\Employees\\" + id + ".txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String info = String.valueOf(reader.nextLine());
                System.out.println(inf[i] + info);
                i++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("\n" + e.getMessage() + "\nInvalid ID, Try Again ;[");
        }
    }
}

