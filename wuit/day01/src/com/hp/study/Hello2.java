//时间:2023/4/15 19:36

package com.hp.study;

import java.util.Scanner;

public class Hello2 {
    //菜单：一级菜单 二级菜单
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("------欢迎--------");
            System.out.println("1.注册  2.登录  3.退出");
            int i = sc.nextInt();
            if (i==1){
                System.out.println("注册");
            }else if (i==2){
                System.out.println("登录");
            }else{
                break;
            }
        }
        System.out.println("欢迎下次光临");
    }
}
