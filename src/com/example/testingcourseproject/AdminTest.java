package com.example.testingcourseproject;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AdminTest {

    static Admin admin;

    @Test
    public void getId()
    {
        admin = new Admin("20pxxxx", "user", "password");
        String id = admin.getId();
        assertEquals("20pxxxx", id);
    }

    @Test
    public void setId()
    {
        admin.setId("20p1234");
        String id = admin.getId();
        int id_len = id.length();
        assertEquals("20p1234", id);
        assertEquals(7, id_len);
    }
    @Test
    public void getAccount()
    {
        admin = new Admin("20p7732", "user", "password");
        String name = admin.getAccount().getUsername();
        String pass = admin.getAccount().getPassword();
        assertEquals("user", name);
        assertEquals("password", pass);

    }

}