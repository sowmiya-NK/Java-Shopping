package Controller.Implementation;

import utilis.AppException;

public interface IAppController {
    void init() throws AppException;
    void printAuthMenu();
}
