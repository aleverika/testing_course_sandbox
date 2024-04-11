package ru.aleverika.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.aleverika.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactAddingTest extends BaseTest {


  public static List<ContactData> contactDataProvider() {
    var result = new ArrayList<ContactData>();
    result.add(new ContactData(randomString(10), randomString(10), randomString(10), randomString(15), randomString(7), randomString(8), randomString(30), randomNumberString(8), randomNumberString(8), randomNumberString(8), randomNumberString(6), randomString(4)+"@"+randomString(3)+"."+randomString(2), "", "", "", "25", "May", "1998", "", "" ));
    result.add(new ContactData("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",""));
    result.add(new ContactData("Anton", "Victor", "Gorodetskiy",
            "good_boy", "", "Red&White", "", "+7978765787",
            "3678907", "", "", "all@mail.com", "", "",
            "", "13", "July", "1987", "", ""));
    return result;
  }

  @ParameterizedTest
  @MethodSource("contactDataProvider")
  public void canContactAdd(ContactData contact) {
    int contactCount = app.contact().getContactCount();
    app.contact().contactCreation(contact);
    int newContactCount = app.contact().getContactCount();
    Assertions.assertEquals(contactCount+1, newContactCount);
  }

}
