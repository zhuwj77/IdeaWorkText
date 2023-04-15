//时间:2023/4/15 20:45

package com.hp.service;

import com.hp.bean.User;
import com.hp.dao.UserDao;

import java.util.Scanner;

public class Userservice {
    //定义当前的账户：登录成功的时候，最新的账户会覆盖上一次登录的账户
    private User curr_login_user;
    private Scanner sc = new Scanner(System.in);
    //引入执行层
    private UserDao userDao=new UserDao();

    public void register() {
        System.out.println("-------注册业务------");
        System.out.println("请输入您的用户名");
        String username=sc.nextLine();
        System.out.println("请输入您的密码");
        String password=sc.nextLine();
        userDao.register(username,password);
    }

    public boolean login() {
        System.out.println("-----登录业务---------");
        System.out.println("请输入您的用户名");
        String username=sc.nextLine();
        System.out.println("请输入您的密码");
        String password=sc.nextLine();
        //调用执行层的方法
        User user = userDao.login(username, password);
        if (user!=null){
            //登录成功的时候，最新的账户会覆盖上一次登录的账户
            curr_login_user=user;
            return true;
        }else {
            return false;
        }
    }

    public void showMoney() {
        System.out.println("-------查看账户余额-------");
        System.out.println("尊敬的"+curr_login_user.getUsername()+"您好！您的账户余额是："+curr_login_user.getMoney()+"元！");
    }

    public void addInCome() {
        System.out.println("账户余额充值业务");
    }

    public void lookOrByCars() {
        System.out.println("跑车4s店欢迎您");
    }

    public void showMyCars() {
        System.out.println("进入我的车库");
    }
}
