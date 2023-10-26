package utilis;

import java.util.InputMismatchException;

public class AppInput {
    //string
    public  static  String enterString(String mgs) {
        Utilis.print(mgs);
        return AppScanner.getScanner().nextLine();

    }

    //int
    public static int enterInt(String mgs) throws AppException {
        Utilis.print(mgs);
//
        int input;
        try {
            input = AppScanner.getScanner().nextInt();

        } catch (InputMismatchException e) {
            throw new AppException(Stringutilies.INVALID_USER);
        }
        return input;

    }

}
