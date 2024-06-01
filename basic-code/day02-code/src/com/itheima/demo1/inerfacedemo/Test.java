package com.itheima.demo1.inerfacedemo;

public class Test {
    public static void main(String[] args) {
        //创建青蛙的对象
        Frog f = new Frog("小青",1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();
        f.show();
        Swim.moo();
    }
}
