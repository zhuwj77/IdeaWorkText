//时间:2023/4/15 20:35

package com.hp.bean;

public class Car {
    private String brand;//品牌
    private String type;//型号
    private double price;//价格
    private String color;//颜色

    @Override
    public String toString() {
        return "Car{" +
                "bran='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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

    public Car(String bran, String type, double price, String color) {
        this.brand = bran;
        this.type = type;
        this.price = price;
        this.color = color;
    }
}
