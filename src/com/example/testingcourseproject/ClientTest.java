package com.example.testingcourseproject;

import com.example.testingcourseproject.Account;
import com.example.testingcourseproject.Client;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class ClientTest {

    static Client client;
    static Client client2;
    static Client client3;
    static Account acc;
    @Test
    public void createAccount()
    {
       client.createAccount("name", "password");
        String name = client.getAccount().getUsername();
        String pw = client.getAccount().getPassword();
        assertEquals("name", name);
        assertEquals("password", pw);

    }

    @Test
    public void addTransaction()
    {
        client.addTransaction("gas", 100.5);
        client.addTransaction("electricity", 200);
        client.addTransaction("rent", 1000);
        assertEquals("gas", client.getTransactions().get(0).getType());
    }

    @Test
    public void getId()
    {
        client = new Client("20pxxxx", "name", "cairo", "01xxxxxxxxx",
                "test@gmail.com", 2000, "user", "password");
        String id = client.getId();
        assertEquals("20pxxxx", id);
    }

    @Test
    public void setId()
    {
        client.setId("20pxxxx");
        String id = client.getId();
        int id_len = id.length();
        assertEquals("20pxxxx", id);
        assertEquals(7, id_len);
    }

    @Test
    public void getName()
    {
        client = new Client("20pxxxx", "mohamed", "cairo", "01099243030",
                "test@gmail.com", 2000, "user", "password");
        String name = client.getName();
        assertEquals("mohamed", name);

    }

    @Test
    public void setName()
    {
        client.setName("ramzi");
        String name = client.getName();
        assertEquals("ramzi", name);
    }

    @Test
    public void getAddress()
    {
        client = new Client("20pxxxx", "mohamed", "cairo", "01099243030",
            "test@gmail.com", 2000, "user", "password");
        String address = client.getAddress();
        assertEquals("cairo", address);
    }

    @Test
    public void setAddress()
    {
        client.setAddress("cairo");
        String address = client.getAddress();
        assertEquals("cairo", address);
    }

    @Test
    public void getPhoneNumber()
    {
        client = new Client("20pxxxx", "mohamed", "cairo", "12345",
                "test@gmail.com", 2000, "user", "password");
        String p_num = client.getPhoneNumber();
        assertEquals("12345", p_num);

    }

    @Test
    public void setPhoneNumber()
    {
        client.setPhoneNumber("01xxxxxxxxx");
        String p_num = client.getPhoneNumber();
        int p_num_length = p_num.length();
        assertEquals("01xxxxxxxxx", p_num);
        assertEquals(11, p_num_length);
    }

    @Test
    public void getEmail()
    {
        client = new Client("20pxxxx", "mohamed", "cairo", "12345",
                "test@gmail.com", 2000, "user", "password");
        String email = client.getEmail();
        assertEquals("test@gmail.com", email);
    }

    @Test
    public void setEmail()
    {
        client = new Client("20pxxxx", "mohamed", "cairo", "12345",
                "test@gmail.com", 2000, "user", "password");
        client.setEmail("test@icloud.com");
        String email = client.getEmail();
        assertEquals("test@icloud.com", email);
    }

    @Test
    public void getBalance()
    {
        client = new Client("20pxxxx", "mohamed", "cairo", "12345",
                "test@gmail.com", 2000, "user", "password");
        double balance = client.getBalance();
        assertEquals(2000,balance, 0.1);
    }

    @Test
    public void setBalance()
    {
        client = new Client("20pxxxx", "mohamed", "cairo", "12345",
                "test@gmail.com", 2000, "user", "password");
        client.setBalance(3000.0);
        double balance = client.getBalance();
        assertEquals(3000, balance, 0.1);
    }

    @Test
    public void getAccount()
    {
        client = new Client("20pxxxx", "mohamed", "cairo", "12345",
                "test@gmail.com", 2000, "user", "password");
        String name_acc = client.getAccount().getUsername();
        String pw_acc = client.getAccount().getPassword();
        assertEquals("user", name_acc);
        assertEquals("password", pw_acc);
    }

    @Test
    public void setAccount()
    {
        acc = new Account("user", "password");
        client.setAccount(acc);
        String name_acc = client.getAccount().getUsername();
        String pw_acc = client.getAccount().getPassword();
        assertEquals("user", name_acc);
        assertEquals("password", pw_acc);
    }

    @Test
    public void getTransactions()
    {
        client2 = new Client("20pxxxx", "mohamed", "cairo", "01099243030",
                "test@gmail.com", 2000, "user", "password");
        client2.addTransaction("gas", 100);
        client2.addTransaction("electricity", 200);
        client2.addTransaction("rent", 1000);
        assertEquals(3, client2.getTransactions().size());
    }
}