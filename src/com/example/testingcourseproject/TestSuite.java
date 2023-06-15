package com.example.testingcourseproject;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
       AdminTest.class,TransactionTest.class,
        ClientTest.class, AccountTest.class


})

public class TestSuite {

}