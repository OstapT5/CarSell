package controllers;

public interface Controller {

    void initModel(Object... value);
    void changeModel(Object... value);
    String updateModel();
}
