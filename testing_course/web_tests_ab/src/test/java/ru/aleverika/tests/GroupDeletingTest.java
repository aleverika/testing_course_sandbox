package ru.aleverika.tests;

import org.junit.jupiter.api.Assertions;
import ru.aleverika.model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupDeletingTest extends BaseTest {

    @Test
    public void groupDeleting() {
        if (app.groups().getCount()==0) {
            app.groups().groupCreate(new GroupData("testing_group", "testing logo", "comment to show how does it work"));
        }
        int groupCount = app.groups().getCount();
        app.groups.removeGroup();
        int newGroupCount = app.groups().getCount();
        Assertions.assertEquals(groupCount-1,newGroupCount);
    }

    @Test
    void canDeleteAllGroupsAtOnce(){
        if (app.groups().getCount()==0) {
            app.groups().groupCreate(new GroupData("testing_group", "testing logo", "comment to show how does it work"));
        }
        app.groups().removeAllGroups();
        Assertions.assertEquals(0, app.groups().getCount());
    }

}
