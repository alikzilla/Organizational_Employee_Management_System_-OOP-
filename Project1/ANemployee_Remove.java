package Project1;

import java.io.File;

public class ANemployee_Remove implements ANremove {
    ANemployee_Remove() {

    }

    @Override
    public void removeEmployee(int id) {
        File file = new File("D:\\Desktop\\Employees\\" + id + ".txt");
        if (file.exists()) {
            file.delete();
            System.out.println("\nEmployee Successfully deleted :]");
        } else {
            System.out.println("\nD:\\Desktop\\Employees\\"+ id +".txt (Не удается найти указанный файл)");
            System.out.println("Invalid ID, Try Again ;[");
        }
    }
}