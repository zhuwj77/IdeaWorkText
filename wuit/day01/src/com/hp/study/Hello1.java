//时间:2023/4/15 19:17

package com.hp.study;

import java.util.Scanner;

//控制台接受
public class Hello1 {
    //主方法--程序入口
    public static void main(String[] args) {
        //1.创建sc对象
        Scanner sc = new Scanner(System.in);//快捷键自动补全：Alt+Enter
        //2.调用sc的nextxxx方法,接受控制台输入的内容
        String s=sc.nextLine();

        System.out.println("您在控制台输入的内容被我接受到了，哈哈，他是:"+s);
    }
}
