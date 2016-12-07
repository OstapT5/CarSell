package models;

public class SignUpPageModel {

    private UserModel user;

    public UserModel getUser() {
        return user;
    }

    public SignUpPageModel(String email) {
        user = new UserModel(email);
    }
}
