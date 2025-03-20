package org.example;

public class Main {
    public static void main(String[] args) {
        // Автоматическое создание объектов с заданными значениями
        Tablet p0 = new Tablet("Apple", "ipad 16", 900, 4000, 6, "black");
        p0.displayInfo();

        // Автоматическое создание объекта телефона
        String phone_brand = "Apple";
        String phone_model = "iphone 14";
        int phone_price = 1000;
        int phone_battery = 4500;
        int phone_diagonal = 6;
        String phone_color = "black";

        Phone p1 = new Phone(phone_brand, phone_model, phone_price, phone_battery, phone_diagonal, phone_color);
        p1.displayInfo();

        // Автоматическое создание объекта ноутбука
        String l_brand = "Apple";
        String l_model = "MacBook Pro";
        int l_price = 2500;
        String l_cpu = "M1 Pro";
        int l_ram = 16;
        int l_ssd = 512;

        Laptop l1 = new Laptop(l_brand, l_model, l_price, l_cpu, l_ram, l_ssd);
        l1.displayInfo();

        // Автоматическое создание объекта часов
        String watch_brand = "Apple";
        String watch_model = "Apple Watch Series 7";
        int watch_price = 400;
        String watch_color = "silver";
        String watch_strap = "leather";
        Boolean watch_water = true;

        Watch w1 = new Watch(watch_brand, watch_model, watch_price, watch_color, watch_strap, watch_water);
        w1.displayInfo();

        // Вызовы методов для созданных объектов
        p1.call("88005553535");
        p1.sms("89002234555", "hello world!");

        l1.upgrade();
        l1.reinstallOS();

        w1.checkTime();
        w1.forwardTime(3);

        // Вывод количества объектов
        System.out.println("Всего объектов создано: " + Gadget.getCounter());
    }
}
