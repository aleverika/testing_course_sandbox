package ru.aleverika.manager;

import org.openqa.selenium.By;

public class LoginHelper extends BaseHelper {

    public LoginHelper(ApplicationManager manager) {
        super(manager);
    }

    void getLogin(String login, String password) {
        type(By.name("user"), login);
        type(By.name("pass"), password);
        click(By.xpath("//input[@value=\'Login\']"));

    }
}
