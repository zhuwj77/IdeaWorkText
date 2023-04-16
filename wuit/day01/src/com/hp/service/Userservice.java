//时间:2023/4/15 20:45

package com.hp.service;

import com.hp.bean.Car;
import com.hp.bean.User;
import com.hp.dao.UserDao;
import com.hp.utils.CarUtil;

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
        System.out.println("---------充值业务--------");
        System.out.println("请输入您要充值的金额：");
        double money = sc.nextDouble();
        curr_login_user.setMoney(curr_login_user.getMoney()+money);
    }

    public void lookOrByCars() {
        System.out.println("-------跑车4s店欢迎您-----");
        //1.展示所有车型look
        CarUtil.showCars(CarUtil.getCars());
        System.out.println("请问您想买哪一款跑车：1.奔驰大G 2.保时捷918 3.兰博基尼小牛  4.先不买");
        //2.买车业务：1.扣款2.交车
        int i = sc.nextInt();
        Car[] cars = CarUtil.getCars();
        if (i <= cars.length && i >= 1) {
            //2.1扣款
            curr_login_user.setMoney(curr_login_user.getMoney() - cars[i-1].getPrice());
            //2.2交车--存到当前用户的车库
            Car[] myCars = CarUtil.addMyCars(curr_login_user.getMyCars(), cars[i - 1]);
            curr_login_user.setMyCars(myCars);
            System.out.println("恭喜您成为尊贵的"+cars[i-1].getBrand()+"车主,愿您生活愉快");

        }else {
            System.out.println("您可以暂时寄存您的梦想，来日方长");
        }
    }
    //1.展示所有车型look
    public void showMyCars() {
        System.out.println("-------进入我的私人车库--------");
        CarUtil.showCars(curr_login_user.getMyCars());
    }
}
