package com.example.testingcourseproject;
import com.example.testingcourseproject.Transaction;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class TransactionTest
{
    static Transaction test;

    @Test
    public void getId()
    {
        test = new Transaction("gas", 100);
        int num = test.getId();
        assertEquals(2, num);
    }

    @Test
    public void getType()
    {
        test = new Transaction("gas", 100);
        String type = test.getType();
        assertEquals("gas", type);
    }

    @Test
    public void setType()
    {
        test.setType("gas");
        String type = test.getType();
        assertEquals("gas", type);
    }

    @Test
    public void getAmount()
    {
        test = new Transaction("gas", 100);
        double amount = test.getAmount();
        assertEquals(100, amount,0.1);
    }

    @Test
    public void setAmount()
    {
        test.setAmount(1000);
        double amount = test.getAmount();
        assertEquals(1000, amount, 0.1);
    }

    @Test
    public void showTransaction()
    {
        test = new Transaction("gas", 100);


        String actual = "Transaction ID: " + test.getId() + ", " +
                "Amount: " + test.getAmount() + ", " +
                "Type: " + test.getType() + ".\n";
        String expected = "Transaction ID: " + 1 + ", " +
                "Amount: " + 100.0 + ", " +
                "Type: " + "gas" + ".\n";
        assertEquals(expected, actual);
    }
}