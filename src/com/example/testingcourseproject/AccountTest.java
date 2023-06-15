package com.example.testingcourseproject;

import static org.junit.Assert.*;

import com.example.testingcourseproject.Account;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AccountTest {

    static Account test;
    @org.junit.Test
    public void getUsername()
    {
        test = new Account("admin", "password");
        String name =test.getUsername();
        assertEquals("admin", name);
    }
    @org.junit.Test
    public void getPassword()
    {
        test = new Account("admin", "password");
        String pw = test.getPassword();
        assertEquals("password", pw);
    }

    @org.junit.Test
    public void setUsername()
    {
        test = new Account("user", "passcode");
        test.setUsername("admin");
        String name =test.getUsername();
        assertEquals("admin", name);
    }
    @org.junit.Test
    public void setPassword()
    {
        test = new Account("admin", "passcode");
        test.setPassword("password");
        String pw =test.getPassword();
        assertEquals("password", pw);
    }
}