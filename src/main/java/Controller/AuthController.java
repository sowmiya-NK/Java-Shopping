package Controller;

import Controller.Implementation.IAuthController;
import View.RegisterPage;
import shopping.Role;
import shopping.User;
import utilis.AppException;
import utilis.Stringutilies;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


import static utilis.AppInput.enterInt;
import static utilis.AppInput.enterString;
import static utilis.Fileutil.getCredentialFile;
import static utilis.Utilis.println;

public class AuthController implements IAuthController {
    private final HomeController homeController;
    private final AppController appController;

    public AuthController(AppController appController) {
        this.appController = appController;
        homeController = new HomeController();

    }

    //select login or register
    @Override
    public void AuthMenu() throws AppException {
        appController.printAuthMenu();
        int choice;
        try {
            choice = enterInt(Stringutilies.ENTER_CHOICE);
            if (choice == 1)
                login();
            else if (choice == 2) {
                register();

            } else
                inValidChoice(new AppException(Stringutilies.INVALID_CHOICE));//pass error


        } catch (AppException appException) {
            inValidChoice(appException);

        }

    }


    //login
    @Override
    public void login() throws AppException {
        String email, password;
        email = enterString(Stringutilies.ENTER_EMAIL);
        password = enterString(Stringutilies.ENTER_PASSWORD);
        User user = ValidateUser(email, password);
        if (user != null)
            homeController.PrintMenu();
        else
            AuthMenu();

    }

    //validate user checking
    private User ValidateUser(String email, String password) {
        try {
            Scanner scanner = new Scanner(getCredentialFile());
            //hasnext=true check
            while (scanner.hasNext()) {
                String data = scanner.next().trim();
                if (!data.startsWith("id")) {
                    String[] userArray = data.split(",");
                    if (userArray[2].equals(email) && userArray[3].equals(password)) {
                        User user = new User();
                        user.setId(Integer.parseInt(userArray[0]));
                        user.setUsername(userArray[1]);
                        user.setEmailid(userArray[2]);
                        user.setPassword((userArray[3]));
                        if (user.getEmailid().equals(("anu@admin.com")))
                            user.setRole(Role.ADMIN);
                        else
                            user.setRole(Role.USER);
                        return user;

                    }

                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    //registration
    @Override
    public void register() throws AppException {
        String email, username, password, confirmpassword;
        email = enterString(Stringutilies.ENTER_EMAIL);
        username = enterString(Stringutilies.ENTER_USERNAME);
        password = enterString(Stringutilies.ENTER_PASSWORD);
        confirmpassword = enterString(Stringutilies.ENTER_CONFIRMPASSWORD);

        if (password.equals(confirmpassword)) {
            try {
                FileWriter fileWriter = new FileWriter(getCredentialFile(), true);
                int id = (int) (Math.random() * 100);
                fileWriter.append("\n");
                fileWriter.append(id + " " + username + " " + email + " " + password + " " + confirmpassword);
                fileWriter.flush();
                fileWriter.close();
                RegisterPage.printRegistrationSuccessful();


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            RegisterPage.passwordMisMatch();
        }
        AuthMenu();


    }

    @Override
    public void logout() {

    }


    public void inValidChoice(AppException e) throws AppException {
        println(e.getMessage());
        AuthMenu();


    }
}
