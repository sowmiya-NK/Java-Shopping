package Controller.Implementation;

import utilis.AppException;

public interface IAuthController {
    void login() throws AppException;
    void register() throws AppException;
    void logout();
    void AuthMenu() throws AppException;

}
