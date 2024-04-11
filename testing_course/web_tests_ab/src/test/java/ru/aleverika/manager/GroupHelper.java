package ru.aleverika.manager;

import org.openqa.selenium.By;
import ru.aleverika.model.GroupData;

public class GroupHelper extends BaseHelper {


    public GroupHelper(ApplicationManager manager) {
        super(manager);
    }

    public void OpenGroupPage() {
        if (!manager.isElementExist(By.name("new"))) {
            click(By.linkText("groups"));
        }
    }

    public boolean isGroupExist() {
        OpenGroupPage();
        return manager.isElementExist(By.name("selected[]"));
    }

    public void GroupCreate(GroupData group) {
        OpenGroupPage();
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
    }

    public void removeGroup() {
        OpenGroupPage();
        selectGroup();
        deleteClick();
        returnToGroupPage();
    }

    public void modifyGroup(GroupData modifiedGroup) {
        OpenGroupPage();
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


}
