package ru.aleverika.tests;

import ru.aleverika.manager.ApplicationManager;
import org.junit.jupiter.api.BeforeEach;

import java.util.Random;

public class BaseTest {
protected static ApplicationManager app;

    protected static String randomNumberString(int n) {
        var rnd = new Random();
        var result = "";
        for (int i = 0; i<n; i++){
            result = result + (char)('0' + rnd.nextInt(10));
        }
        return result;
    }

    @BeforeEach
    public void setUp() {
        if (app == null){
            app = new ApplicationManager();
        }
        app.init(System.getProperty("browser", "chrome"));
    }

    public static String randomString(int n){
        var rnd = new Random();
        var result = "";
        for (int i = 0; i<n; i++){
            result = result + (char)('a' +rnd.nextInt(26));
        }
        return result;
    }

}
