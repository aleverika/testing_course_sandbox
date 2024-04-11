package ru.aleverika.tests;

import org.junit.jupiter.api.Test;
import ru.aleverika.model.ContactData;

public class ContactAddingTest extends BaseTest {


  @Test
  public void canContactAdd() {


    app.contact().contactCreation(new ContactData("Anton", "Victor", "Gorodetskiy",
            "good_boy", "", "Red&White", "", "+7978765787",
            "3678907", "", "", "all@mail.com", "", "",
            "", "13", "July", "1987", "", ""));
  }
  @Test
  public void canEmptyContactAdd(){
    app.contact().contactCreation(new ContactData("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",""));
  }
}
