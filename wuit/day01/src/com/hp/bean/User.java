//时间:2023/4/15 20:01

package com.hp.bean;

import java.util.Arrays;

public class User {
    private String username;//用户名
    private String password;//密码
    private double money;//余额
    private Car[] myCars={};

    public Car[] getMyCars() {
        return myCars;
    }

    public void setMyCars(Car[] myCars) {
        this.myCars = myCars;
    }
//封装，构造，输出Alt+Insert

    public static void main(String[] args) {
        System.out.println(new User());
    }

    @Override
    public String toString() {//输出对象时，不在输出哈希值，二十输出属性值
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", myCars=" + Arrays.toString(myCars) +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public User() {
    }

    public User(String username, String password, double money) {
        this.username = username;
        this.password = password;
        this.money = money;
    }
    //两个参数的构造
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
