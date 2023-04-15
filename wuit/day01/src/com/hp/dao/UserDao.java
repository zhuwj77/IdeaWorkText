//时间:2023/4/15 21:04

package com.hp.dao;

import com.hp.bean.User;

import java.util.Arrays;

public class UserDao {
    //定义了一个对象数组，用于存放所有注册的用户信息
    private User[] user_db=new User[]{};

    public void register(String username, String password) {
        //1.根据用户输入的用户名和密码构建一个用户对象
        User user = new User(username, password);
        //2.把这个用户对象，存入对象数组
        userAdd(user);

    }
    //向数组末尾添加新元素
    private void userAdd(User user){
        //1.数组扩容
        //System.out.println("扩容前的长度：" + user_db.length);
        //使用数组工具类，把原数组复制一份，同时给予一个新长度，返回一个新数组
        user_db=Arrays.copyOf(user_db, user_db.length + 1);
        //System.out.println("扩容后的长度："+user_db.length);
        //2.把user放在数组末尾
        user_db[user_db.length-1]=user;
    }

    //登陆方法
    public User login(String username, String password) {
        //循环遍历整个user_db数组，诸葛查看是否存在
        for (User user : user_db) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                System.out.println("登录成功");
                return new User(username,password);
            }
        }
        System.out.println("登录失败");
        return null;
    }
}
