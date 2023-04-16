//时间:2023/4/16 16:12

package com.hp.utils;

import com.hp.bean.Car;

import java.util.Arrays;

public class CarUtil {
    //声明一个跑车数组
    private static Car[] cars;
    static{
        //1.构建3个跑车对象
        Car car1 = new Car("奔驰 ","大G",3000000,"红色");
        Car car2 = new Car("保时捷","918",4000000,"黑色");
        Car car3 = new Car("兰博基尼","小牛",5000000,"白色");
        //2.把3个对象存入数组
        cars=new Car[]{car1,car2,car3};
    }
    public static Car[] getCars(){
        return cars;
    }

    //给我的车库扩容,返回新数组,myCars表示我的车库，car表示我买的那辆车
    public static Car[] addMyCars(Car[] myCars,Car car){
        //1.我的车库扩容
        myCars = Arrays.copyOf(myCars, myCars.length + 1);
        //2.
        myCars[myCars.length-1]=car;
        return myCars;
    }
   public static void showCars(Car[] cars) {
        //展示某个跑车数组的所有车型
        //输出数组
        System.err.println("品   牌\t   型号\t颜色\t价格");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getBrand()+"\t   "+cars[i].getType()+"\t"+cars[i].getColor()+"\t"+cars[i].getPrice());
        }

    }
}
