package ru.aleverika.manager;

import org.openqa.selenium.By;
import ru.aleverika.model.ContactData;

public class ContactHelper extends BaseHelper {

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void openHomePage() {
        if (!manager.isElementExist(By.name("searchstring"))) {
            click(By.linkText("home"));
        }
    }

    public void returnHomePage() {
        click(By.linkText("home"));
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contact) {
        type(By.name("firstname"), contact.FirstName());
        type(By.name("middlename"), contact.SecondName());
        type(By.name("lastname"), contact.LastName());
        type(By.name("nickname"), contact.Nickname());
        type(By.name("title"), contact.Title());
        type(By.name("company"), contact.Company());
        type(By.name("address"), contact.Address());
        type(By.name("mobile"), contact.MobilePhone());
        type(By.name("work"), contact.WorkPhone());
        type(By.name("home"), contact.Homepage());
        type(By.name("fax"), contact.Fax());
        type(By.name("email"), contact.Email_1());
        type(By.name("email2"), contact.Email_2());
        type(By.name("email3"), contact.Email_3());
        type(By.name("homepage"), contact.Homepage());
        select(By.name("bday"), contact.B_day());
        select(By.name("bmonth"), contact.B_month());
        type(By.name("byear"), contact.B_year());
        select(By.name("new_group"), contact.Group());
    }

    public void submitContactAdding() {
        click(By.name("submit"));
    }

    private void deleteClick() {
            click(By.xpath("//input[@value='Delete']"));
    }
    public int getContactCount(){
        openHomePage();
        return manager.driver.findElements(By.name("selected[]")).size();
    }

    private void contactSelect() {
            click(By.name("selected[]"));
    }

    private void allContactSelect(){
        click(By.id("MassCB"));
    }

    public void contactCreation(ContactData contactData) {
        openHomePage();
        initContactCreation();
        fillContactForm(contactData);
        submitContactAdding();
        returnHomePage();
    }

    public void contactDeleting() {
        openHomePage();
        contactSelect();
        deleteClick();
        returnHomePage();
    }
    public void allContactDeleting(){
        openHomePage();
        allContactSelect();
        deleteClick();
        returnHomePage();
    }
}
