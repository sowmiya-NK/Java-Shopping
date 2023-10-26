package View;

import utilis.Stringutilies;

import static utilis.Utilis.println;

public class RegisterPage {
    public static void passwordMisMatch() {
        try {
            println("-------------------");
            println(Stringutilies.PASSWORD_MISMATCH);
            println("----------------------");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printRegistrationSuccessful() {
        try{
            println("------------------------------");
            println(Stringutilies.REGISTRATION_SUCCESSFULLY);
            println("----------------------------------");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
