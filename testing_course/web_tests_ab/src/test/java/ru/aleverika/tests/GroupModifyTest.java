package ru.aleverika.tests;

import org.junit.jupiter.api.Test;
import ru.aleverika.model.GroupData;

public class GroupModifyTest extends BaseTest {

    @Test
    public void canModifyGroup() {

        if (!app.groups().isGroupExist()) {
            app.groups().GroupCreate(new GroupData("testing_group", "testing logo", "comment to show how does it work"));
        }
        app.groups().modifyGroup(new GroupData().withName("modified name"));

    }
}
