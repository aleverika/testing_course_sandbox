package ru.aleverika.manager;

import org.openqa.selenium.By;
import ru.aleverika.model.GroupData;

public class GroupHelper extends BaseHelper {


    public GroupHelper(ApplicationManager manager) {
        super(manager);
    }

    public void openGroupPage() {
        if (!manager.isElementExist(By.name("new"))) {
            click(By.linkText("groups"));
        }
    }

    public boolean isGroupExist() {
        openGroupPage();
        return manager.isElementExist(By.name("selected[]"));
    }

    public void groupCreate(GroupData group) {
        openGroupPage();
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
    }

    public void removeGroup() {
        openGroupPage();
        selectGroup();
        deleteClick();
        returnToGroupPage();
    }

    public void modifyGroup(GroupData modifiedGroup) {
        openGroupPage();
        selectGroup();
        initGroupModification();
        fillGroupForm(modifiedGroup);
        submitGroupModification();
        returnToGroupPage();
    }


    private void submitGroupCreation() {
        click(By.name("submit"));
    }


    private void initGroupCreation() {
        click(By.name("new"));
    }


    private void deleteClick() {
        click(By.name("delete"));
    }


    private void returnToGroupPage() {
        click(By.linkText("groups"));
    }

    private void submitGroupModification() {
        click(By.name("update"));
    }

    private void fillGroupForm(GroupData groupData) {
        if (!"".equals(groupData.Name())) {
            type(By.name("group_name"), groupData.Name());
        }
        if (!"".equals(groupData.Header())) {
            type(By.name("group_header"), groupData.Header());
        }
        if (!"".equals(groupData.Footer())) {
            type(By.name("group_footer"), groupData.Footer());
        }
    }


    private void initGroupModification() {
        click(By.name("edit"));
    }

    private void selectGroup() {
        click(By.name("selected[]"));
    }


    public int getCount() {
        openGroupPage();
        return manager.driver.findElements(By.name("selected[]")).size();
    }

    private void selectAllGroups() {
        var checkboxes = manager.driver.findElements(By.name("selected[]"));
        for (var checkbox : checkboxes) {
            checkbox.click();
        }
    }
    public void removeAllGroups(){
        selectAllGroups();
        deleteClick();
    }

}
