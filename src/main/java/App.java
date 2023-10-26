

import Controller.AppController;
import utilis.AppException;

public class App {
    public static void main(String[] args) throws AppException {
        AppController appController=new AppController();
        appController.init();

    }
}
