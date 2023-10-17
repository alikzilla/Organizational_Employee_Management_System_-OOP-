package Project1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AlikhanNuspekov {
    static String OMS = """      
                    _________________________________________________
                                                                      
                            =𝙊𝙧𝙜𝙖𝙣𝙞𝙯𝙖𝙩𝙞𝙤𝙣 𝙈𝙖𝙣𝙖𝙜𝙚𝙢𝙚𝙣𝙩 𝙎𝙮𝙨𝙩𝙚𝙢=  
                                      -Welcome-     
                    _________________________________________________
            """;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean end = true;
        System.out.println(OMS);
        while (end) {
            Menu m = new Menu();
            while (true) {
                try {
                    m.mainMenu();
                    System.out.print("\nPlease Enter Choice : ");
                    int choice = in.nextInt();
                    if (choice >= 1 && choice <= 5) {
                        switch (choice) {
                            case 1 -> {
                                ANemployee_Add add = new ANemployee_Add();
                                add.createFile();
                                promptEnterKey();
                            }
                            case 2 -> {
                                ANemployee_Show show = new ANemployee_Show();
                                System.out.print("\nPlease Enter Employee's ID : ");
                                int id = in.nextInt();
                                show.getInfo(id);
                                promptEnterKey();
                            }
                            case 3 -> {
                                ANemployee_Remove remove = new ANemployee_Remove();
                                System.out.print("\nPlease Enter Employee's ID : ");
                                int id = in.nextInt();
                                remove.removeEmployee(id);
                                promptEnterKey();
                            }
                            case 4 -> {
                                ANemployee_Update update = new ANemployee_Update();
                                System.out.print("\nPlease Enter Employee's ID : ");
                                int id = in.nextInt();
                                update.employeeUpdate(id);
                                promptEnterKey();
                            }
                            case 5 -> {
                                CodeExit cd = new CodeExit();
                                cd.Exit();
                                end = false;
                            }
                        }
                    } else {
                        System.out.println("\nInvalid Input, Try Numbers From 1 To 5 ;[");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("\nInputMismatchException, Try Again ;[");
                    in.next();
                    promptEnterKey();
                }
            }
        }
    }

    public static void promptEnterKey() {
        System.out.print("\nPress \"ENTER\" to continue...\n");
        try {
            System.in.read();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
