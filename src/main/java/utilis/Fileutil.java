package utilis;

import java.io.File;

public class Fileutil {
    private static File credentialFile;

    public static File getCredentialFile() {
        if (credentialFile == null)
            credentialFile = new File("src/main/java/assests/UserDate.csv");
        return credentialFile;
    }

}
