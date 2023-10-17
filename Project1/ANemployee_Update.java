package Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ANemployee_Update {
    static Scanner in = new Scanner(System.in);
    static ArrayList<String> ar = new ArrayList<>();

    ANemployee_Update() {

    }

    public void employeeUpdate(int id) {
        int count = 0;
        File file = new File("D:\\Desktop\\Employees\\" + id + ".txt");
        if (file.exists()) {
            System.out.print("\nEnter Your Old Information: ");
            String oInfo = in.next();
            System.out.print("\nEnter Your New Information: ");
            String nInfo = in.next();
            try {
                Scanner in = new Scanner(file);
                while (in.hasNextLine()) {
                    String data = String.valueOf(in.nextLine());
                    ar.add(data);
                }
                in.close();
                for (int i = 0; i < ar.size(); i++) {
                    if (ar.get(i).equals(oInfo) && !ar.get(0).equals(oInfo)) {
                        ar.set(i, nInfo);
                        count++;
                    }
                }

                if(count != 1 || ar.get(0).equals(oInfo)){
                    System.out.println("\nInvalid Input ;[");
                }
                if(count == 1){
                    System.out.println("\nNew Updates Updated :]");
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
            if (count == 1) {
                try {
                    file.delete();
                    FileWriter fr = new FileWriter("D:\\Desktop\\Employees\\" + id + ".txt");
                    file.createNewFile();
                    for (int i = 0; i < ar.size(); i++) {
                        fr.write(ar.get(i) + "\n");
                    }
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            System.out.println("\nInvalid ID, Try Again ;[");
        }
        count = 0;
        ar.removeAll(ar);
    }
}