import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupAddingTest extends BaseTest {

    @Test
    public void CanAddGroup() {
        OpenGroupPage();
        GroupCreate(new GroupData("testing_group", "testing logo", "comment to show how does it work"));
    }

    @Test
    public void CanAddGroupEmptyName() {
        OpenGroupPage();
        GroupCreate(new GroupData());
    }
    @Test
    public void CanAddGroupWithName() {
        OpenGroupPage();
        var emptyGroup = new GroupData();
        var groupWithName = emptyGroup.withName("beautiful_name");
        GroupCreate(groupWithName);
    }
}
