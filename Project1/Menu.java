package Project1;

public class Menu extends AlikhanNuspekov{
    String menu = """
            |===============|MENU|=================|
            |Press 1 -> Add an Employee Details    |
            |Press 2 -> See an Employee Details    |
            |Press 3 -> Remove an Employee         |
            |Press 4 -> Update an Employee Details |
            |Press 5 -> Exit the EMS Portal        |
            |======================================|
            """;
    Menu(){

    }
    public void mainMenu(){
        System.out.println(menu);
    }
}

