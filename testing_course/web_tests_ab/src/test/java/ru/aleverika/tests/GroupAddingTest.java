package ru.aleverika.tests;

import org.junit.jupiter.api.Assertions;
import ru.aleverika.model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupAddingTest extends BaseTest {

    @Test
    public void CanAddGroup() {
        int groupCount = app.groups().getCount();
        app.groups().groupCreate(new GroupData("testing_group", "testing logo", "comment to show how does it work"));
        int newGroupCount = app.groups().getCount();
        Assertions.assertEquals(groupCount+1, newGroupCount);
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
