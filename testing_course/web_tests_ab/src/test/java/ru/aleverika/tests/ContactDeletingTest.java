package ru.aleverika.tests;

import org.junit.jupiter.api.Test;
import ru.aleverika.model.ContactData;

public class ContactDeletingTest extends BaseTest {

    @Test
    public void canContactDelete() {
        if (app.contact().getContactCount()==0) {
            app.contact().contactCreation(new ContactData("Anton", "Victor", "Gorodetskiy",
                    "good_boy", "", "Red&White", "", "+7978765787",
                    "3678907", "", "", "all@mail.com", "", "",
                    "", "13", "July", "1987", "", ""));
        }
        app.contact().contactDeleting();

    }

    @Test
    public void canAllContactDelete(){
        if (!(app.contact().getContactCount()==0)) {
            app.contact().contactCreation(new ContactData("Anton", "Victor", "Gorodetskiy",
                    "good_boy", "", "Red&White", "", "+7978765787",
                    "3678907", "", "", "all@mail.com", "", "",
                    "", "13", "July", "1987", "", ""));
        }
        app.contact().allContactDeleting();


    }
}
