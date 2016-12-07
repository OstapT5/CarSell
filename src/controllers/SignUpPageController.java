package controllers;

import models.SignUpPageModel;

public class SignUpPageController implements Controller {

    private SignUpPageModel model;

    @Override
    public void initModel(Object... email) {
        model = new SignUpPageModel((String)email[0]);
    }

    @Override
    public void changeModel(Object... email) {
        model.getUser().setEmail((String)email[0]);
    }

    @Override
    public String updateModel() {
        return model.getUser().toString();
    }
}
