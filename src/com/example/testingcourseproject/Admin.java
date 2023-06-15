
package com.example.testingcourseproject;
public class Admin
{
    private String id;
    private com.example.testingcourseproject.Account account;
    private final boolean isAdmin = true;
    public Admin()
    {}

    public Admin(String id, String username, String password){

        this.id = id;
        this.Admin(username, password);
    }
    public boolean Admin(String username, String password)
    {
        this.account = new com.example.testingcourseproject.Account(username, password);
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.example.testingcourseproject.Account getAccount() {
        return account;
    }

    public void setAccount(com.example.testingcourseproject.Account account) {
        this.account = account;
    }
}
