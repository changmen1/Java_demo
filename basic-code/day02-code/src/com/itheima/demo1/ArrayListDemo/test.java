package com.itheima.demo1.ArrayListDemo;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        // 1.创建集合对象
        // 泛型：限定集合中存储数据的类型
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.remove("a");
        System.out.println(list);
        list.set(0, "c");
        System.out.println(list);
        list.get(0);
        System.out.println(list);
        System.out.println(list.size());
    }
}
