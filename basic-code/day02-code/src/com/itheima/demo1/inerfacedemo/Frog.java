package com.itheima.demo1.inerfacedemo;

public class Frog extends Animal implements Swim {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙再吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳");
    }

    @Override
    public void show() {
        System.out.println("重写默认方法");
    }
}
