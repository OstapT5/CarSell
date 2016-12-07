package views;

import controllers.UserController;

public class UserView {

    public static void main(String[] args) {
        userViewer();
    }

    private static void userViewer() {
        UserController controller = new UserController();
        controller.initUser("Ostap", "Obervan", 20, "obervanostap@gmail.com", "password");
        controller.updateUser();
        controller.changeUser("Taras", "Obervan", 21, "obervantaras@gmail.com", "password1");
        controller.updateUser();
    }
}
