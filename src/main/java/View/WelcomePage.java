package View;

import utilis.Stringutilies;

import static utilis.Utilis.println;

public class WelcomePage {
    public void welcome() {
        println(Stringutilies.WELCOME_PAGE);
        //Thread.sleep(500);
        
    }

    public void printAuthMenu() {
        println(Stringutilies.AUTH_MENU);
    }
}
