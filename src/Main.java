import controllers.GroupStudentsController;
import controllers.LoginController;
import controllers.TeachersController;
import models.LoggedUserSignleton;

import java.util.Scanner;
public class Main {

    /**
     * Запускає програму обліку студентів у групі
     * @param args
     */
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        String cmd;
        Scanner inputDevice = new Scanner(System.in);

        String[] commandsList = {"list group", "list students", "list teacher", "login", "exit"};

        GroupStudentsController groupStudentsController = new GroupStudentsController();
        TeachersController teachersController=new TeachersController();
        boolean isEnd = false;

        while( !isEnd){
            System.out.println("Введіть команду, ? - help:");
            cmd = inputDevice.nextLine();
            LoggedUserSignleton loggedUserSignleton = LoggedUserSignleton.getInstance();
            switch (cmd) {
                case "list group":
                    if(loggedUserSignleton.isLoggedUser()) {
                        groupStudentsController.listGroup();
                    } else {
                        System.out.println("You are not logged!");
                    }
                    break;
                case "list students":
                    if(loggedUserSignleton.isLoggedUser()) {
                        groupStudentsController.listStudents();
                    } else {
                        System.out.println("You are not logged!");
                    }
                    break;
                case "exit":
                    isEnd = true;
                    break;
                case "?":
                    for(String str: commandsList){
                        System.out.println(str);
                    }
                    break;
                case "login":
                    LoginController loginController = new LoginController();
                    loginController.login();
                    break;
                case "list teacher":
                    if(loggedUserSignleton.isLoggedUser()) {
                        teachersController.listTeacher();
                    } else{
                        System.out.println("You are not logged!");

                    }
                    break;

            }
        }
    }
}
