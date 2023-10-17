package Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ANemployee_Add extends ANemployDetail {
    static Scanner in = new Scanner(System.in);

    ANemployee_Add() {

    }

    public void createFile() {
        while (true) {
            try {
                addName();
                addAge();
                addId();
                addEmail();
                addPos();
                addCon();
                addSal();
                saveFile();
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void addName() {
        boolean nameb = true;
        int count = 0;
        System.out.print("\nEnter Employee's name ----------: ");
        while (true) {
            try {
                while (nameb) {
                    String name = in.next();
                    for (int i = 0; i < name.length(); i++) {
                        if (Character.isDigit(name.charAt(i))) {
                            count++;
                        }
                    }
                    if(count == 0){
                        setName(name);
                        nameb = false;
                    }else{
                        System.out.print("Invalid Input-_-\nTry Again:");
                        count = 0;
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print(e + ", Try again: ");
                in.next();
            }
        }
    }

    public void addAge() {
        System.out.print("\nEnter Employee's age -----------: ");
        while (true) {
            try {
                int age = in.nextInt();
                setAge(age);
                break;
            } catch (InputMismatchException e) {
                System.out.print(e + ", Try again: ");
                in.next();
            }
        }
    }


    public void addId() {
        System.out.print("\nEnter Employee's ID ------------: ");
        while (true) {
            try {
                int id = in.nextInt();
                setId(id);
                break;
            } catch (InputMismatchException e) {
                System.out.print(e + ", Try again: ");
                in.next();
            }
        }
    }

    public void addEmail() {
        boolean email1 = true;
        System.out.print("\nEnter Employee's Email ID ------: ");
        while (true) {
            try {
                while (email1) {
                    String email = in.next();
                    if (email.endsWith("@mail") || email.endsWith("@stu.sdu.edu.kz") || email.endsWith("@gmail")) {
                        setEmail(email);
                        email1 = false;
                    } else {
                        System.out.print("Invalid Email: ");
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print(e + ", Try again: ");
                in.next();
            }
        }
    }

    public void addPos() {
        boolean posb = true;
        int count = 0;
        System.out.print("\nEnter Employee's Position ------: ");
        while (true) {
            try {
                while (posb) {
                    String pos = in.next();
                    for (int i = 0; i < pos.length(); i++) {
                        if (Character.isDigit(pos.charAt(i))) {
                            count++;
                        }
                    }
                    if(count == 0){
                        setPosition(pos);
                        posb = false;
                    }else{
                        System.out.print("Invalid Input-_-\nTry Again:");
                        count = 0;
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print(e + ", Try again: ");
                in.next();
            }
        }
    }

    public void addCon() {
        System.out.print("\nEnter Employee's contact Info --: ");
        while (true) {
            try {
                long con = in.nextLong();
                setContact(con);
                break;
            } catch (InputMismatchException e) {
                System.out.print(e + ", Try again: ");
                in.next();
            }
        }
    }

    public void addSal() {
        boolean sal1 = true;
        float sal2 = 0;
        int count = 0;
        System.out.print("\nEnter Employee's Salary --------: ");
        while (true) {
            try {
                while (sal1) {
                    String sal = in.next();
                    String withoutDollar = sal.substring(0, sal.length() - 1);
                    if (sal.endsWith("$")) {
                        for (int i = 0; i < withoutDollar.length(); i++) {
                            if(Character.isLetter(withoutDollar.charAt(i))){
                                count++;
                            }
                        }
                        if(count == 0){
                            sal2 += Float.parseFloat(sal.substring(0, sal.length() - 1));
                            setSalary(sal2);
                            sal1 = false;
                        } else {
                            System.out.print("Invalid Input-_-\nTry Again: ");
                            count = 0;
                        }
                    } else {
                        System.out.print("Invalid input, add \"$\": ");
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print(e + ", Try again: ");
                in.next();
            }
        }
    }

    public void saveFile() throws IOException {
        while (true) {
            try {
                File file = new File("D:\\Desktop\\Employees\\" + getId() + ".txt");
                if (!file.exists()) {
                    file.createNewFile();
                    FileWriter write = new FileWriter("D:\\Desktop\\Employees\\" + getId() + ".txt");
                    write.write(getId() + "\n");
                    write.write(getName() + "\n");
                    write.write(getAge() + "\n");
                    write.write(getContact() + "\n");
                    write.write(getEmail() + "\n");
                    write.write(getPosition() + "\n");
                    write.write(getSalary() + "$\n");
                    write.close();
                    System.out.println("\nEmployee has been successfully Added :)");
                    break;
                } else {
                    System.out.println("\nID is not available, choose another ID");
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex + ", Try again-_-");
            }
        }
    }
}
