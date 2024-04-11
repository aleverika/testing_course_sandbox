package ru.aleverika.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.aleverika.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class GroupAddingTest extends BaseTest {
    public static List<GroupData> groupProvider() {
        var result = new ArrayList<GroupData>();
        for (var name : List.of("", "group name")){
            for (var header : List.of("","group header")){
                for (var footer: List.of("", "group footer")){
                    result.add(new GroupData(name,header, footer));
                }
            }
        }
        for (int i = 0; i< 5; i++ ) {
            result.add(new GroupData(randomString(i*10), randomString(i*10), randomString(i*10)));
        }
        return result;
    }

    public static List<GroupData> groupNegativeProvider() {
        var result = new ArrayList<GroupData>(List.of(
                new GroupData("one name'", "one header", "")));
        return result;
    }


    @ParameterizedTest
    @MethodSource("groupProvider")
    public void CanAddMultipleGroup(GroupData group) {
        int groupCount = app.groups().getCount();
        app.groups().groupCreate(group);
        int newGroupCount = app.groups().getCount();
        Assertions.assertEquals(groupCount+1, newGroupCount);
    }
    @ParameterizedTest
    @MethodSource("groupNegativeProvider")
    public void CannotAddGroup(GroupData group) {
        int groupCount = app.groups().getCount();
        app.groups().groupCreate(group);
        int newGroupCount = app.groups().getCount();
        Assertions.assertEquals(groupCount, newGroupCount);
    }
}
