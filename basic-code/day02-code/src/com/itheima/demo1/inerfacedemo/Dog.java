package com.itheima.demo1.inerfacedemo;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃屎");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
