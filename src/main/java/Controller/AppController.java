package Controller;

import Controller.Implementation.IAppController;
import View.WelcomePage;
import utilis.AppException;

public class AppController implements IAppController {
    private final WelcomePage welcomepage;
    private final AuthController authController;

    public AppController() {
        welcomepage = new WelcomePage();
        authController = new AuthController(this);
    }

    public void init() throws AppException {
        welcomepage.welcome();
        authController.AuthMenu();

    }
    //print login and register
    @Override
    public void printAuthMenu() {
        welcomepage.printAuthMenu();

    }


}
