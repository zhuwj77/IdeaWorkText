//时间:2023/4/15 20:40

package com.hp.controller;

import com.hp.service.Userservice;

import java.util.Scanner;

public class CarSysMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Userservice userservice = new Userservice();
        while(true){
            System.out.println("------欢迎光临厚溥跑车俱乐部--------");
            System.out.println("请选择功能：1.注册  2.登录  3.退出系统");
            int i = sc.nextInt();
            if (i==1){
                //调用业务层的注册方法
                userservice.register();
            }else if (i==2) {
                //调用业务层的登录方法
                boolean isLogin=userservice.login();
                if (isLogin){
                    //登录成功才进入二级菜单
                    while (true) {
                        System.out.println("------个人中心-------");
                        System.out.println("请选择功能：1.查看账户  2.账户充值  3.跑车4s店  4.查看我的车库  5.返回上一级");
                        int i2 = sc.nextInt();
                        if (i2 == 1) {
                            userservice.showMoney();
                        } else if (i2 == 2) {
                            userservice.addInCome();
                        } else if (i2 == 3) {
                            userservice.lookOrByCars();
                        } else if (i2 == 4) {
                            userservice.showMyCars();
                        } else {
                            break;
                        }
                    }
                }
            }else{
                break;
            }
        }
        System.out.println("欢迎下次光临");
    }
    }

