package com.example.psyclone.labtest;

/**
 * Created by Psyclone on 21/7/2560.
 */

public class Account {
    private String name;
    private String tel;
    private String email;

    public Account() {
    }

    public Account(String name, String tel, String email) {
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
