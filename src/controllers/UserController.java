package controllers;

import models.UserModel;

public class UserController {

    private UserModel model;

    public void initUser(String firstName, String lastName, Integer age, String eMail, String password) {
        model = new UserModel(firstName, lastName, age, eMail, password);

    }

    public void changeUser(String firstName, String lastName, Integer age, String eMail, String password) {

        model.setFirstName(firstName == null ? model.getFirstName() : firstName);
        model.setLastName(lastName == null ? model.getLastName() : lastName);
        model.setAge(age == null ? model.getAge() : age);
        model.seteMail(eMail == null ? model.geteMail() : eMail);
        model.setPassword(password == null ? model.getPassword() : password);
    }

    public void updateUser() {
        System.out.println(model);
    }
}
