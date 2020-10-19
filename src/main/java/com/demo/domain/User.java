package com.demo.domain;

import static sun.misc.Version.print;

public class User {
    private String account;
    private String password;
    private String username;
    private String gender;
    private String city;

    public User(){}

    public User(String account,String password,String username,String gender,String city){
        this.account=account;
        this.password=password;
        this.username=username;
        this.gender=gender;
        this.city=city;
    }

    public int verify(String password){
        if(this.password.equals(password))
            return 1;
        else
            return 2;
    }
    public void getInfo() {
        System.out.println(
                "username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'');
    }
    @Override
    public String toString() {
        return "User{" +
                "account=" + account +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", city=" + city +
                '}';
    }


}