import model.GroupData;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class GroupDeletingTest extends BaseTest {

    @Test
    public void groupDeleting() {
        OpenGroupPage();
        if (!isElementExist(By.name("selected[]"))) {
          GroupCreate(new GroupData("testing_group", "testing logo", "comment to show how does it work"));
        }
        driver.findElement(By.name("selected[]")).click();
        driver.findElement(By.name("delete")).click();
        driver.findElement(By.linkText("groups")).click();
    }

}
