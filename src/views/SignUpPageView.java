package views;

import controllers.SignUpPageController;

import java.util.Scanner;

public class SignUpPageView {

    private static SignUpPageController controller = new SignUpPageController();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        signUpPageViewer();
        sc.close();
    }

    private static void signUpPageViewer() {
        controller.initModel(readEmail());
        System.out.println(controller.updateModel());
    }

    private static String readEmail() {
        System.out.println("Please, enter your e-mail:");
        return sc.nextLine();
    }
}
