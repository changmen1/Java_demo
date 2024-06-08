package com.itheima.demo1.errordemo;

public class demo1 {
    public static void main(String[] args) {
        try {
            System.err.println(123);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
