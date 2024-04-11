package ru.aleverika.tests;

import ru.aleverika.model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupDeletingTest extends BaseTest {

    @Test
    public void groupDeleting() {
        if (!app.groups().isGroupExist()) {
            app.groups().GroupCreate(new GroupData("testing_group", "testing logo", "comment to show how does it work"));
        }
            app.groups.removeGroup();
    }

}
