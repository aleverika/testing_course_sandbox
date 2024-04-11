package ru.aleverika.tests;

import ru.aleverika.model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupAddingTest extends BaseTest {

    @Test
    public void CanAddGroup() {
        app.groups().groupCreate(new GroupData("testing_group", "testing logo", "comment to show how does it work"));
    }

    @Test
    public void CanAddGroupEmptyName() {
        app.groups().groupCreate(new GroupData());
    }
    @Test
    public void CanAddGroupWithName() {
        app.groups().groupCreate(new GroupData().withName("beautiful_name"));
    }
}
