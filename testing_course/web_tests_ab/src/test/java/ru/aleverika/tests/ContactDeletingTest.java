package ru.aleverika.tests;

import org.junit.jupiter.api.Test;

public class ContactDeletingTest extends BaseTest {

    @Test
    public void canContactDelete() {
        app.contact().contactDeleting();
    }

    @Test
    public void canAllContactDelete(){
        app.contact().allContactDeleting();
    }
}
