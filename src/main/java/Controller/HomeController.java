package Controller;

import Controller.Implementation.IHomeController;

public class HomeController implements IHomeController {


    @Override
    public void PrintMenu() {
        System.out.println("welcome");
    }
}
