//时间:2023/4/15 19:49

//时间:2023/4/15 19:36

package com.hp.study;

import java.util.Scanner;

public class Hello3 {
    //菜单：一级菜单 二级菜单
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("------欢迎--------");
            System.out.println("1.注册  2.登录  3.退出");
            int i = sc.nextInt();
            if (i==1){
                System.out.println("注册");
            }else if (i==2) {
                System.out.println("登录");
                System.out.println("一系列登录操作，登录成功了");
                while (true) {
                    System.out.println("------个人中心-------");
                    System.out.println("1.余额  2.充值  3.跑车店  4.我的车库  5.返回上一级");
                    int i2 = sc.nextInt();
                    if (i2 == 1) {
                        System.out.println("余额");
                    } else if (i2 == 2) {
                        System.out.println("充值");
                    } else if (i2 == 3) {
                        System.out.println("跑车店");
                    } else if (i2 == 4) {
                        System.out.println("我的车库");
                    } else {
                        break;
                    }
                }
            }else{
                break;
            }
        }
        System.out.println("欢迎下次光临");
    }
}

