package ru.aleverika.tests;

import ru.aleverika.manager.ApplicationManager;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
protected static ApplicationManager app;

    @BeforeEach
    public void setUp() {
        if (app == null){
            app = new ApplicationManager();
        }
        app.init(System.getProperty("browser", "chrome"));
    }

}
