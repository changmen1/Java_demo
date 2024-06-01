package com.itheima.demo1.inerfacedemo;

public interface Swim {
    public abstract void swim();
    public default void show(){
        System.out.println("接口中的默认方法");
        handlePrivate();
    };
    public static void moo(){
        System.out.println("接口中的静态方法");
        handlePrivate2();
    }
    private void handlePrivate(){
        System.out.println("默认私有方法");
    }
    private static void handlePrivate2(){
        System.out.println("static私有方法");
    }
}
