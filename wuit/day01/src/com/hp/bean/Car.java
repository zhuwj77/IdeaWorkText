//时间:2023/4/15 20:35

package com.hp.bean;

public class Car {
    private String bran;//品牌
    private String type;//型号
    private String price;//价格
    private String color;//颜色

    @Override
    public String toString() {
        return "Car{" +
                "bran='" + bran + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBran() {
        return bran;
    }

    public void setBran(String bran) {
        this.bran = bran;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
    }

    public Car(String bran, String type, String price, String color) {
        this.bran = bran;
        this.type = type;
        this.price = price;
        this.color = color;
    }
}
